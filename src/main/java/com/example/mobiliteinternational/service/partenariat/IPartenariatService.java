package com.example.mobiliteinternational.service.partenariat;

import com.example.mobiliteinternational.entity.Etudiant;
import com.example.mobiliteinternational.entity.Partenariat;

import java.util.List;

public interface IPartenariatService {


    Partenariat addPartenariat(Partenariat partenariat);

    Partenariat UpdatePartenariat(Partenariat partenariat);

    void deletePartenariat(int idpartenariat);

    List<Partenariat> findAllPartenariat();

    Partenariat findByIdPartenariat(int idPartenariat);


}
