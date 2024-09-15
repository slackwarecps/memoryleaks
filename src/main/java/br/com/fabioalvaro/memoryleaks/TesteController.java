package br.com.fabioalvaro.memoryleaks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.ArrayList;

@Controller

@RequestMapping("testes")
public class TesteController {

    private static final Logger logger = LoggerFactory.getLogger(StaticFieldsMemoryLeakUnitTest.class);


@GetMapping("/um")
    public ResponseEntity<String> teste1() {
        logger.info("Debug Point 1");
        new StaticFieldsMemoryLeakUnitTest().populateList();
        logger.info("Debug Point 3");
        return ResponseEntity.ok("teste um");
     
    }

 
        



    @GetMapping("/tres")
    public ResponseEntity<String> teste3() {
        return ResponseEntity.ok("Olá Mundo");
    }
}
