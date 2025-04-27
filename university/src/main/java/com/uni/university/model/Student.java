package com.uni.university.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private long stud_book;

    @ManyToOne(optional = true)
    @OnDelete(action = OnDeleteAction.SET_DEFAULT)
    @JoinColumn(name = "stgroup_id", nullable = true)
    private Stgroup stgroup;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentControl> studentControls = new ArrayList<>();
}
