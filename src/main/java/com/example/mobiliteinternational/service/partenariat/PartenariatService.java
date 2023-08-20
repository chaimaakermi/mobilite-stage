package com.example.mobiliteinternational.service.partenariat;

import com.example.mobiliteinternational.entity.Partenariat;
import com.example.mobiliteinternational.repository.PartenariatRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Partenariat")
@AllArgsConstructor
public class PartenariatService implements IPartenariatService {

    private final PartenariatRepository partenariatRepository;


    @Override
    public Partenariat addPartenariat(Partenariat partenariat) {
        return null;
    }

    @Override
    public Partenariat UpdatePartenariat(Partenariat partenariat) {
        return null;
    }

    @Override
    public void deletePartenariat(int idpartenariat) {

    }

    @Override
    public List<Partenariat> findAllPartenariat() {
        return null;
    }

    @Override
    public Partenariat findByIdPartenariat(int idPartenariat) {
        return null;
    }
}
