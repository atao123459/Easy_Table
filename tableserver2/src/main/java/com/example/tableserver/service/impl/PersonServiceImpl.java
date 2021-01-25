package com.example.tableserver.service.impl;

import com.example.tableserver.dao.PersonMapper;
import com.example.tableserver.pojo.Person;
import com.example.tableserver.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper mapper;

    @Override
    public List<Person> findAll() {
        return mapper.findAll();
    }
}
