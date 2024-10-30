package com.eddie.primeiroprojeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define esta classe como um controlador RESTful
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired //Injeta o GreetingService no GreetingController
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet") // Cria um endpoint /greet que responde com uma saudação obtida pelo serviço
    public String greet() {
        return greetingService.getGreeting();
    }
}
