package com.example.orgaulasenai.controle;

import com.example.orgaulasenai.model.pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
public class controle
{
    private final List<pessoa> persons = new ArrayList<>();
    private int id = 0;

    public pessoa findpessoa(String name){
        for(pessoa p : persons){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public pessoa addpessoa(String name, String sexo){
        pessoa person = new pessoa();
        person.setName(name);
        person.setSexo(sexo);
        id++;
        person.setId(id);
        persons.add(person);
        return person;
    }

    public void removePerson(String name){

        //implementar método remover
    }

    public pessoa editPerson(String name, String sexo){
        //implementar método editar
        return null;
    }


}

