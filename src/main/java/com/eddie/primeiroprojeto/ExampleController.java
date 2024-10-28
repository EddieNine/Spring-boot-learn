package com.eddie.primeiroprojeto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example") // Define uma rota base para os endpoints deste controlador
public class ExampleController {

    // Endpoint GET
    @GetMapping("/get")
    public String getExample(){
        return "Esta é uma resposta GET!";
    }

    // Endpoint POST
    @PostMapping("/post")
    public String postExample(@RequestBody String data) {
        return "Recebemos o seguinte dado via POST: " + data;
    }

    // Endpoint PUT
    @PutMapping("/put/{id}")
    public String putExample(@PathVariable int id, @RequestBody String newData){
        return "Atualizamos o recurso com ID " + id + " para o valor: " + newData;
    }

    // Endpoint DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteExample(@PathVariable int id) {
        return "Recurso com ID " + id + " foi deletado.";
    }
}
