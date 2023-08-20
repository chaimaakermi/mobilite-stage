package com.example.mobiliteinternational.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Partenariat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPartenariat;

    private String nomRepresentatif;
    private String emailRepresentatif;
    private Date datePartenariat;
    private Statut statut;

    @OneToOne(mappedBy = "partenariat")
    private Universite universite;
}
