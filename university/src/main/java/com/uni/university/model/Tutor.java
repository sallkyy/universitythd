package com.uni.university.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tutor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String occup;

    @ManyToMany
    @JoinTable(
            name = "tutor_discipline",
            joinColumns = @JoinColumn(name = "tutor_id"),
            inverseJoinColumns = @JoinColumn(name = "discipline_id")
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Discipline> disciplines = new ArrayList<>();

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Control> controls = new ArrayList<>();
}
