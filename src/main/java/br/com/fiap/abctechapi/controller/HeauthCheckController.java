package br.com.fiap.abctechapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informa que é um controller
@RequestMapping("/")//Mapeamento pela raiz
public class HeauthCheckController {

    @GetMapping("version")
    public ResponseEntity<Object> status(){
        return ResponseEntity.ok().build();
    }
}
