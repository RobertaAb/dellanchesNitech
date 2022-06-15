package com.nitech.dellanches.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Table
@Data
@Entity
@Generated
public class ClientEntity {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Integer id;

    private String name;
    private String phone;
    private String state;
    private String city;
    private String district;
    private String cpf;
    private String cnpj;
    private String address;
    private String description;

}
