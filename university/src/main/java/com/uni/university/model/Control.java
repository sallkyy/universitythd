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

    @ManyToOne(optional = false)
    @JoinColumn(name = "discipline_id", nullable = false)
    private Discipline discipline;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tutor_id", nullable = false)
    private Tutor tutor;

    @OneToMany(mappedBy = "control", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentControl> studentControls = new ArrayList<>();

    private LocalDate date_of_exam;
}
