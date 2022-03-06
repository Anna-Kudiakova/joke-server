package com.example.securetracktraining.dao.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
public class Categories {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean programming;

    @Column(nullable = false)
    private boolean misc;

    @Column(nullable = false)
    private boolean dark;

    @Column(nullable = false)
    private boolean pun;

    @Column(nullable = false)
    private boolean spooky;

    @Column(nullable = false)
    private boolean christmas;

}
