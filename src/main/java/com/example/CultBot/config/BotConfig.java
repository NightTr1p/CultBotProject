package com.example.CultBot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Configuration
public class BotConfig extends TelegramLongPollingBot {

    private final String BOTUSERNAME;
    private final String BOTTOKEN;

    public BotConfig(@Value("${telegram.bot.username}") String botUsername,
                     @Value("${telegram.bot.token}") String botToken) {
        this.BOTUSERNAME = botUsername;
        this.BOTTOKEN = botToken;
    }

    @Override
    public String getBotUsername() {
        return BOTUSERNAME;
    }

    @Override
    public String getBotToken() {
        return BOTTOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
