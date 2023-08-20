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
@EqualsAndHashCode
public class MobiliteInternational {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMobiliteInternational;
    private Date dateDebut;
    private Date dateFin;

    @OneToOne(mappedBy = "mobiliteInternational")
    private Etudiant etudiant;
}