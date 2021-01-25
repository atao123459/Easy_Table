package com.example.tableserver.controller;

import com.example.tableserver.pojo.Person;
import com.example.tableserver.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "findAll")
    public List<Person> findAll(){
        log.info("查询所有人的信息");
        List<Person> personList = service.findAll();
        return personList;
    }
}
