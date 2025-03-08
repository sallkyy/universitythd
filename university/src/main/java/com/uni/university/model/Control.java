package com.uni.university.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "control")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Control {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    @OneToMany(mappedBy = "control", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentControl> studentControls = new ArrayList<>();

    private int result;
    private LocalDate date_of_exam;
    private boolean corruption;
}
