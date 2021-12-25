package com.example.demo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
    @Data
    @Entity
    @Table(name = "students")
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private int id;

        @Column(name = "name")
        private String name;

        @Column(name = "school")
        private String description;

//        @Column(name = "address")
//        private String address;
//
//        @Column(name = "level")
//        private String level;
}
