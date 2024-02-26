package com.main.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String name;
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Review> reviews;

}
