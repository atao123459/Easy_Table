package com.example.tableserver.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Data
@Accessors(chain = true)
public class Person {
    private int id;
    private String userName;
    private String zone;
    private String email;
    private String sex;
    private String phone;
    private String CreateTime;
}
