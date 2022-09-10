package br.com.fiap.abctechapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.Properties;

@RestController //Informa que é um controller
@RequestMapping("/")//Mapeamento pela raiz
public class HeauthCheckController {

    @GetMapping("version")
    public ResponseEntity<Object> status() throws Exception{
        Properties properties = new Properties();//Pega as propriedades
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.yaml");//leitura de propriedades
        properties.load(inputStream);
        return ResponseEntity.ok(properties.getProperty("build.name") + " - " + properties.getProperty("build.version"));
    }
}
