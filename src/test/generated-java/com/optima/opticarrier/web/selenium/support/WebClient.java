/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/support/WebClient.p.vm.java
 */
package com.optima.opticarrier.web.selenium.support;

import static com.optima.opticarrier.web.selenium.support.FollowVisually.FollowLevel.TRACE;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.apache.commons.lang.StringUtils.containsIgnoreCase;
import static org.apache.commons.lang.StringUtils.isNotBlank;
import static org.springframework.web.util.JavaScriptUtils.javaScriptEscape;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.StopWatch;

import com.google.common.base.Function;
import com.optima.opticarrier.web.selenium.support.FollowVisually.FollowLevel;
import com.optima.opticarrier.web.selenium.support.elements.WebElementConfiguration;

public class WebClient {
    public final WebDriver webDriver;
    private long driverWaitBeforeStopInSeconds = 10;
    private long waitAfterClickInMs = 0;
    private long waitAfterClearInMs = 0;
    private long waitAfterStepInMs = 0;
    private long waitAfterFillInMs = 0;
    private long waitAfterNotificationInMs = 0;
    private boolean followVisually = false;
    private FollowLevel followLevel;

    public WebClient(WebDriver webDriver, Object instanceTest) {
        this.webDriver = webDriver;
        handleFollowVisually(instanceTest);
        new WebElementConfiguration().configure(instanceTest, this);
    }

    private void handleFollowVisually(Object instanceTest) {
        FollowVisually followVisually = instanceTest.getClass().getAnnotation(FollowVisually.class);
        if (followVisually != null) {
            this.driverWaitBeforeStopInSeconds = followVisually.driverWaitBeforeStopInSeconds();
            this.waitAfterClickInMs = followVisually.waitAfterClickInMs();
            this.waitAfterClearInMs = followVisually.waitAfterClearInMs();
            this.waitAfterStepInMs = followVisually.waitAfterStepInMs();
            this.waitAfterFillInMs = followVisually.waitAfterFillInMs();
            this.waitAfterNotificationInMs = followVisually.waitAfterNotificationInMs();
            this.followLevel = followVisually.level();
            this.followVisually = true;
        }
    }

    public void fast() {
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void back() {
        webDriver.manage().timeouts().implicitlyWait(driverWaitBeforeStopInSeconds, TimeUnit.SECONDS);
    }

    public void moveOver(By by) {
        waitUntilDisplayed(by);
        moveOver(find(by));
    }

    public void moveOver(WebElement webElement) {
        new Actions(webDriver).moveToElement(webElement).perform();
    }

    public void hasTitle(String title) {
        waitUntilTextIsPresent("<title>" + title + "</title>");
    }

    public void waitUntilTextIsPresent(final String text) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    return from.getPageSource().contains(text);
                }
            });
            success("Found [" + text + "]");
        } catch (RuntimeException e) {
            error("Could not find [" + text + "]", e);
        }
    }

    public void waitUntilTextIsPresent(final WebElement webElement, final String text) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public synchronized Boolean apply(WebDriver driver) {
                    return containsIgnoreCase(webElement.getText(), text.trim());
                }
            });
            success("Found [" + text + "]");
        } catch (RuntimeException e) {
            error("Could not find [" + text + "]", e);
        }
    }

    public void waitUntilTextIsRemoved(final WebElement webElement, final String text) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public synchronized Boolean apply(WebDriver driver) {
                    return !containsIgnoreCase(webElement.getText(), text.trim());
                }
            });
            success("Found different text than [" + text + "]");
        } catch (RuntimeException e) {
            error("Could not find a text different to [" + text + "]", e);
        }
    }

    public void waitUntilDisplayed(final By by) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    return from.findElement(by).isDisplayed();
                }
            });
        } catch (RuntimeException e) {
            error("not displayed " + by, e);
        }
    }

    public void waitUntilRemoved(final By by) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    from.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                    try {
                        return from.findElements(by).isEmpty();
                    } catch (NoSuchElementException e) {
                        return true;
                    } finally {
                        from.manage().timeouts().implicitlyWait(driverWaitBeforeStopInSeconds, TimeUnit.SECONDS);
                    }
                }
            });
        } catch (RuntimeException e) {
            error("not removed " + by, e);
        }
    }

    public void waitUntilDisplayed(final WebElement webElement) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    return webElement.isDisplayed();
                }
            });
        } catch (RuntimeException e) {
            error("element " + webElement.getTagName() + " is not displayed", e);
        }
    }

    public void waitUntilEnabled(final WebElement webElement) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    return webElement.isEnabled();
                }
            });
        } catch (RuntimeException e) {
            error("element " + webElement.getTagName() + " is not enabled", e);
        }
    }

    public void waitUntilEnabled(final By by) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    return from.findElement(by).isEnabled();
                }
            });
        } catch (RuntimeException e) {
            error("element " + by + " is not enabled", e);
        }
    }

    public void waitUntilFound(final By by) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    return !from.findElements(by).isEmpty();
                }
            });
        } catch (RuntimeException e) {
            error("element " + by + "could not be found", e);
        }
    }

    public void waitUntilInvisible(final By by) {
        try {
            until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver from) {
                    WebElement findElement = from.findElement(by);
                    return !findElement.isDisplayed();
                }
            });
        } catch (RuntimeException e) {
            error("element " + by + " is visible", e);
        }
    }

    public boolean until(Function<WebDriver, Boolean> function) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            // iterate until we have no more StaleElementReferenceException
            while (true) {
                try {
                    return tryUntil(function);
                } catch (StaleElementReferenceException e) {
                    //
                }
            }
        } finally {
            stopWatch.stop();
            message(function.getClass().getName() + " took " + stopWatch.getTotalTimeSeconds() + "s", FollowLevel.TRACE);
        }
    }

    private boolean tryUntil(Function<WebDriver, Boolean> function) {
        // test the function now
        if (function.apply(webDriver)) {
            return true;
        }
        // nope ? ok, once more
        if (function.apply(webDriver)) {
            return true;
        }
        // test for 1 second with very rapid tests
        try {
            if (new WebDriverWait(webDriver, 1).until(function)) {
                return true;
            }
        } catch (Exception e) {
            // no op
        }
        // ok it's still not ready, so let's wait
        return new WebDriverWait(webDriver, driverWaitBeforeStopInSeconds).until(function);
    }

    public void step(String text) {
        if (followVisually) {
            message(text);
            sleep(waitAfterStepInMs);
        }
    }

    public void message(String text) {
        message(text, FollowLevel.INFO);
    }

    public void message(String text, FollowLevel level) {
        notification(text, level, "info");
    }

    public void warning(String text) {
        notification(text, FollowLevel.INFO, "warn");
    }

    public void error(String text) {
        if (followVisually) {
            notification(text, FollowLevel.INFO, "error");
            sleep(60);
        }
        throw new RuntimeException(text);
    }

    public void error(String text, Throwable e) {
        if (followVisually) {
            notification(text, FollowLevel.INFO, "error");
            sleep(60);
        }
        throw new RuntimeException(text, e);
    }

    public void success(String text) {
        success(text, this.followLevel);
    }

    public void success(String text, FollowLevel followLevel) {
        notification(text, followLevel, "info");
    }

    public void notification(String text, FollowLevel followLevel, String type) {
        if (!followVisually) {
            return;
        }
        if (followLevel.ordinal() > this.followLevel.ordinal()) {
            return;
        }
        executeJs("growlNotificationBar.renderMessage({detail: '" + javaScriptEscape(text) + "', severity: '" + type + "'});");
        sleep(waitAfterNotificationInMs);
    }

    @SuppressWarnings("unchecked")
    public <T> T executeJs(String js) {
        return (T) ((JavascriptExecutor) webDriver).executeScript(js);
    }

    public void sleep(long sleepInMs) {
        sleep(MILLISECONDS, sleepInMs);
    }

    public void sleep(TimeUnit unit, long sleepInMs) {
        try {
            unit.sleep(sleepInMs);
        } catch (InterruptedException ignore) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickLinkTitle(String title) {
        clickCss("a[title=\"" + javaScriptEscape(title) + "\"]");
    }

    public void clickCss(String css) {
        click(By.cssSelector(css));
    }

    public List<WebElement> findAllNow(By by) {
        fast();
        try {
            return findAll(by);
        } finally {
            back();
        }
    }

    public List<WebElement> findAll(By by) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int i = 0;
        try {
            List<WebElement> findElements = webDriver.findElements(by);
            i = findElements.size();
            return findElements;
        } finally {
            stopWatch.stop();
            message("found " + i + " results in " + stopWatch.getTotalTimeSeconds() + "s for " + by, FollowLevel.TRACE);
        }
    }

    public WebElement find(By by) {
        return webDriver.findElement(by);
    }

    public void click(WebElement webElement) {
        click(webElement, null);
    }

    public void click(By by) {
        try {
            waitUntilDisplayed(by);
            click(find(by), by);
        } catch (StaleElementReferenceException e) {
            error("Not found " + by.toString());
            throw e;
        }
    }

    public void click(WebElement webElement, By by) {
        message("Clicking on " + toReadableString(webElement), TRACE);
        waitUntilDisplayed(webElement);
        if (followVisually) {
            new Highlighter().highlight(((JavascriptExecutor) webDriver), webElement, by);
        }
        webElement.click();
        sleep(waitAfterClickInMs);
    }

    public void clear(WebElement... webElements) {
        for (WebElement webElement : webElements) {
            webElement.clear();
            sleep(waitAfterClearInMs);
        }
    }

    public void fill(By by, String text) {
        fill(find(by), text);
    }

    public void fill(WebElement webElement, String text) {
        waitUntilDisplayed(webElement);
        message("Type " + text + " in " + toReadableString(webElement), TRACE);
        webElement.clear();
        webElement.sendKeys(text);
        sleep(waitAfterFillInMs);
    }

    private String toReadableString(WebElement webElement) {
        String value = webElement.getAttribute("id");
        if (isNotBlank(value)) {
            return value;
        }
        value = webElement.getAttribute("name");
        if (isNotBlank(value)) {
            return value;
        }
        return webElement.getTagName();
    }

    public void selectComboValue(WebElement webElement, String value) {
        new Select(webElement).selectByValue(value);
    }

    public void close() {
        webDriver.close();
    }

    public void takeScreenshot(String description) {
        if (webDriver instanceof TakesScreenshot) {
            try {
                File source = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
                String extension = FilenameUtils.getExtension(source.getAbsolutePath());
                String date = DateFormatUtils.format(new Date(), "HH-mm-ss");
                String path = "./target/screenshots/" + description + "_" + date + "." + extension;
                FileUtils.copyFile(source, new File(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}