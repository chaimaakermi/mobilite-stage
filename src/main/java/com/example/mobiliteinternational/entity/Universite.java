package com.example.mobiliteinternational.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversite;
    private String nom;
    private String email;
    private String telephone;
    private Specialite specialite;

    @OneToOne
    private Partenariat partenariat;

    @OneToMany(mappedBy = "universite")
    private Set<Rating> rating;

    @ManyToMany
    private Set<Etudiant> etudiantsSet;

}
