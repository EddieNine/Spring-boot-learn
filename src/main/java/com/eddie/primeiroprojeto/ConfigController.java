package com.eddie.primeiroprojeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final AppConfig appConfig;

    public ConfigController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/config")
    public String getConfig(){
        return "Titulo: " + appConfig.getTitulo() + ", Descrição: " + appConfig.getDescricao();
    }
}
