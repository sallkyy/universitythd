package com.uni.university.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "student_control")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "control_id", nullable = false)
    private Control control;

    @Column(nullable = true)
    private int attempt;

    private boolean isPaid;
    @Column (nullable = true)
    private String result;

    private LocalDate date_of_control;
}
