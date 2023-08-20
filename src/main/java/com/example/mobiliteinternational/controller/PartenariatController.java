package com.example.mobiliteinternational.controller;

import com.example.mobiliteinternational.entity.Partenariat;
import com.example.mobiliteinternational.service.partenariat.IPartenariatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/partenariat")
public class PartenariatController {

    private final IPartenariatService partenariatService;

    @PostMapping("/ajouterPartenariat")
    public Partenariat ajouterPartenariat(@RequestBody Partenariat partenariat) {
        return partenariatService.addPartenariat(partenariat);
    }


    @PutMapping("/modifierPartenariat")
    public Partenariat UpdatePartenariat(@RequestBody Partenariat partenariat) {
        return partenariatService.UpdatePartenariat(partenariat);
    }

    @DeleteMapping("/supprimerPartenariat/{idP}")
    public void deletePartenariat(@PathVariable("idP") int idPartenariat) {
        partenariatService.deletePartenariat(idPartenariat);

    }

    @GetMapping("/afficherAllPartenariat")
    public List<Partenariat> findAllPartenariat() {
        return partenariatService.findAllPartenariat();
    }


    @GetMapping("/afficherPartenariat/{idP}")
    public Partenariat findByIdConsumer(@PathVariable("idP") int idPartenariat) {
        return partenariatService.findByIdPartenariat(idPartenariat);

    }


}
