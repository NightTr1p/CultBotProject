package com.example.CultBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

@SpringBootApplication
public class CultBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(CultBotApplication.class, args);
	}

}
