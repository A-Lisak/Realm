package com.br.br.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "realm")
public class Realm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private String key;


}
