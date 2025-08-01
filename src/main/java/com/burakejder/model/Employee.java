package com.burakejder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // there is many-to-one (many employee, one department)
    // bircok employee bir departmentta çalışır

    @ManyToOne //(many -> employee, one -> department)
    private Department department;
}
