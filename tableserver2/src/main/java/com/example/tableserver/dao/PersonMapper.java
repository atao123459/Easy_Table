package com.example.tableserver.dao;

import com.example.tableserver.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PersonMapper {

    List<Person> findAll();
}
