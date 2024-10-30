package com.eddie.primeiroprojeto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Indica que esta classe é um serviço
public class GreetingService {
    private final GreetingRepository greetingRepository;

    @Autowired // Injeta o GreetinRepository no GreetingService
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreeting() {
        return greetingRepository.getGreeting();
    }
}
