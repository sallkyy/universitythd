package com.uni.university.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "group_discipline")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GroupDiscipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "stgroup_id", nullable = false)
    private Stgroup stgroup;

    @ManyToOne(optional = false)
    @JoinColumn(name = "discipline_id", nullable = false)
    private Discipline discipline;

    private String type_mark;
    private int semestr;
}
