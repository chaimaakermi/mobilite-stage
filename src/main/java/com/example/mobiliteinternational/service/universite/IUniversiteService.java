package com.example.mobiliteinternational.service.universite;

import com.example.mobiliteinternational.entity.Etudiant;
import com.example.mobiliteinternational.entity.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite addUniversite(Universite universite);

    Universite UpdateUniversite(Universite universite);

    void deleteUniversite(int iduniversite);

    List<Universite> findAllUniversite();

    Universite findByIdUniversite(int idUniversite);
}
