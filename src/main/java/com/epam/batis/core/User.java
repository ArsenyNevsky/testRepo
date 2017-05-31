package com.epam.batis.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
public class User implements Serializable {


    private Integer id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String email;
    private String password;
    private Timestamp birthday;
}
