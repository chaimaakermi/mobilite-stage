package com.example.mobiliteinternational.entity;


import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEtudiant;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String email;
    private String adresse;

    @OneToOne
    private MobiliteInternational mobiliteInternational;

    @ManyToMany(mappedBy = "etudiantsSet")
    private Set<Universite> universiteSet;
}

