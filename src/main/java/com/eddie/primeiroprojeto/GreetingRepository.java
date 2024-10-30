package com.eddie.primeiroprojeto;

import org.springframework.stereotype.Repository;

@Repository // Marca a classe como um respositório gerenciado pelo Spring.
public class GreetingRepository {
    public String getGreeting() {
        return "Olá do repostório";
    }
}
