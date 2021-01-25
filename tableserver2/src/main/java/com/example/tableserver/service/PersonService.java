package com.example.tableserver.service;

import com.example.tableserver.pojo.Person;
import java.util.List;

public interface PersonService {
    //查询所有用户
    List<Person> findAll();
}
