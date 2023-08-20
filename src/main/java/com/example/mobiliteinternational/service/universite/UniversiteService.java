package com.example.mobiliteinternational.service.universite;

import com.example.mobiliteinternational.entity.Universite;
import com.example.mobiliteinternational.exceptions.UniversiteNotFoundException;
import com.example.mobiliteinternational.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Universite")
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {

    private final UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite UpdateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(int iduniversite) {

        if (universiteRepository.existsById(iduniversite)) {
            universiteRepository.deleteById(iduniversite);
        }
        else {
            throw new UniversiteNotFoundException(iduniversite);
        }
    }

    @Override
    public List<Universite> findAllUniversite() {
        return null;
    }

    @Override
    public Universite findByIdUniversite(int idUniversite) {
        return null;
    }
}
