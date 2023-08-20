package com.example.mobiliteinternational.service.etudiant;

import com.example.mobiliteinternational.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant UpdateEtudiant(Etudiant etudiant);

    void deleteEtudiant(int idetudiant);

    List<Etudiant> findAllEtudiant();

    Etudiant findByIdEtudiant(int idEtudiant); // CTRL+H => replace all <3
}
