package com.projeto.customer.customer.repository.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private Role role;
    private String rg;
    private String cpf;

}
