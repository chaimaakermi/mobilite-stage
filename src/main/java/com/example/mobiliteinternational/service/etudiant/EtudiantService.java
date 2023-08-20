package com.example.mobiliteinternational.service.etudiant;

import com.example.mobiliteinternational.entity.Etudiant;
import com.example.mobiliteinternational.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Etudiant")
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public void deleteEtudiant(int idetudiant) {

    }

    @Override
    public List<Etudiant> findAllEtudiant() {
        return null;
    }

    @Override
    public Etudiant findByIdEtudiant(int idEtudiant) {
        return null;
    }
}
