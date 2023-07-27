package com.example.orgaulasenai.view;

import com.example.orgaulasenai.controle.controle;
import com.example.orgaulasenai.model.pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class PessoaV {

    @Autowired

  controle controle;
    @GetMapping("/pessoa")
    public pessoa findpessoa(@PathParam("name") String name){
        return controle.findpessoa(name);
    }


    @DeleteMapping("/pessoa")
    public String deletepessoa(@PathParam("name") String name){
        pessoa person = new pessoa();

        return "Pessoa com o nome de " + name + " foi deletada";
    }

    @PostMapping("/pessoa")
    public pessoa addpessoa(@PathParam("name") String name, @PathParam("sexo") String sexo){
        return controle.addpessoa(name, sexo);
    }

    @PutMapping("/pessoa")
    public pessoa updatepessoa(@PathParam("id") int id, @PathParam("name") String name){
        pessoa p = new pessoa();

        return p;
    }

    @GetMapping("/home")
    public String helloWorld(){
        return "Hello world";
    }
}
