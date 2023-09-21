package br.com.cruzeirodosul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main{

    @Autowired
    @Qualifier("appName")
    private String appName;

    @GetMapping("/")
    public String index(){
        return appName;
    }
    @GetMapping("/rota1")
    public String rota1(){
    return "Yamete kudasai";
    }
    @GetMapping("nome")
    public String nome(){
        return "Pavao canadense";
    }
    @GetMapping("idade")
    public String idade(){
        return "24 casado";
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Olá mundo");
    }
}