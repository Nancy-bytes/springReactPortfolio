package FullStack.fullStackdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Work> works;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Content> contents;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Contact> contacts;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Blog> blogs;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<JobDescription> jobDescriptions;

}
