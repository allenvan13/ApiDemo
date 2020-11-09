package com.example.Controller;


import com.example.DAO.PersonRepository;
import com.example.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> findAll(){
        return personRepository.findAll();
    }

    @PostMapping("/postPerson")
    public String postPerson(@RequestParam(name = "id") Long id,String name){
        if (!id.toString().isEmpty()){
            return ("成功！ body:{\"id\":"
                    +id+
                    " \"name\":\""
                    +name+"\"}");
        }else return ("没传id");
    }



}
