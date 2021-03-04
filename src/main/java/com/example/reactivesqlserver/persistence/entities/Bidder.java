package com.example.reactivesqlserver.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@Data
@Table("Bidder")
public class Bidder {

    @Id
    private Integer id;
    private String name;
    private String email;
    private String password;

}

