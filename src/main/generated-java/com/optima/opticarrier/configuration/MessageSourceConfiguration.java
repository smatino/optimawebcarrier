/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/configuration/MessageSourceConfiguration.p.vm.java
 */
package com.optima.opticarrier.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageSourceConfiguration {
    /**
     * Base message source to handle internationalization<p>
     * Order of basenames matters, the first found property is returned 
     */
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setFallbackToSystemLocale(false);
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setBasenames( // 
                // main resources
                "classpath:/localization/application", "classpath:/localization/messages", //
                // pages
                "classpath:/localization/pages/home", //
                "classpath:/localization/pages/login", //
                "classpath:/localization/pages/concurrentModificationResolution", //
                // default spring security messages
                "classpath:org/springframework/security/messages", //
                //  our bean validation messages
                "classpath:ValidationMessages", //
                // default conversion messages
                "classpath:javax/faces/Messages", //
                // generated domain resources
                "classpath:/localization/domain/BtRequest", //
                "classpath:/localization/domain/CpsDeactivationNotification", //
                "classpath:/localization/domain/CpsDeactivationPrenotification", //
                "classpath:/localization/domain/CpsQuoteRequest", //
                "classpath:/localization/domain/CpsQuoteResponse", //
                "classpath:/localization/domain/CpsQuoteResponsePenali", //
                "classpath:/localization/domain/OloCps", //
                "classpath:/localization/domain/Prefissi", //
                "classpath:/localization/domain/Response", //
                "classpath:/localization/domain/SbcCpsRequest", //
                "classpath:/localization/domain/SbcCpsResponse", //
                "classpath:/localization/domain/SbcFileRequest", //
                "classpath:/localization/domain/SbcFileResponse", //
                "classpath:/localization/domain/SbcWlrRequest", //
                "classpath:/localization/domain/SbcWlrRequestVariation", //
                "classpath:/localization/domain/SbcWlrResponse", //
                "classpath:/localization/domain/TelecomFilePostfix", //
                "classpath:/localization/domain/WlrRequestAggiuntivis", //
                "classpath:/localization/domain/WlrServiceCode", //
                "classpath:/localization/domain/WlrTraslocoCode", //
                // default bean validation messages 
                "classpath:org/hibernate/validator/ValidationMessages" //
        );
        return messageSource;
    }
}
