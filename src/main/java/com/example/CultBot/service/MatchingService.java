package com.example.CultBot.service;

import com.example.CultBot.entity.User;
import com.example.CultBot.repository.UserRepository;
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
