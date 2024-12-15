package com.example.CultBot.controller;

import com.example.CultBot.service.MatchingService;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

    @Autowired
    private MatchingService matchingService;

    public void handleUpdate(Update update) {

    }
}
