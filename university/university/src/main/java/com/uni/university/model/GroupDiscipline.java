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

    @ManyToOne
    @JoinColumn(name = "stgroup_id")
    private Stgroup stgroup;

    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;

    private String type_mark;
}
