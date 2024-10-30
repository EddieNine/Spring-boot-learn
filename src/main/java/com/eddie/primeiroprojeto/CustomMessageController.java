package com.eddie.primeiroprojeto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomMessageController {

    // @Value("${nome.do.parametro}"): Injeta o valor do parâmetro do application.properties na variavel.

    @Value("${app.message}")
    private String message;

    @Value("${app.version}")
    private String version;

    @GetMapping("/info")
    public String getAppInfo() {
        return "Mensagem: " + message + ", Versão: " + version;
    }
}
