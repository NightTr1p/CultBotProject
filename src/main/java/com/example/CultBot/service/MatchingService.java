package com.example.CultBot.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchingService {

    private final UserRepository userRepository;

    public MatchingService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getPotentialMatches(Long userId){
        return userRepository.findAll();
    }
}
