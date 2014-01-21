/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/conversation/component/ConversationMenu.p.vm.java
 */
package com.optima.opticarrier.web.conversation.component;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DynamicMenuModel;
import org.primefaces.model.menu.MenuModel;

import com.optima.opticarrier.web.conversation.Conversation;
import com.optima.opticarrier.web.conversation.ConversationManager;

@Named
@Singleton
public class ConversationMenu {
    @Inject
    private ConversationManager conversationManager;

    public boolean getRender() {
        return !conversationManager.conversationMap().isEmpty();
    }

    public MenuModel getModel() {
        MenuModel model = new DynamicMenuModel();
        Conversation currentConversation = conversationManager.getCurrentConversation();
        for (Conversation conversation : conversationManager.conversationMap().values()) {
            DefaultMenuItem htmlMenuItem = new DefaultMenuItem();
            htmlMenuItem.setValue(conversation.getLabel());
            htmlMenuItem.setUrl(conversation.getUrl());
            if (currentConversation != null && currentConversation.getId().equals(conversation.getId())) {
                htmlMenuItem.setDisabled(true);
            }
            if (isNotBlank(conversation.getLabel())) {
                model.addElement(htmlMenuItem);
            }
        }
        return model;
    }
}
