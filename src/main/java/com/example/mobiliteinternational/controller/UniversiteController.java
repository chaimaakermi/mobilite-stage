package com.example.mobiliteinternational.controller;

import com.example.mobiliteinternational.entity.Universite;
import com.example.mobiliteinternational.service.universite.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    final IUniversiteService universiteService;

    @PostMapping("/ajouterUniversite")
    public Universite ajouterUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }


    @PutMapping("/modifierEUniversite")
    public Universite UpdateUniversite(@RequestBody Universite universite) {
        return universiteService.UpdateUniversite(universite);
    }

    @DeleteMapping("/supprimerUniversite/{idU}")
    public void deleteUniversite(@PathVariable("idU") int idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }

    @GetMapping("/afficherAllUniversite")
    public List<Universite> findAllUniversite() {
        return universiteService.findAllUniversite();
    }

    @GetMapping("/afficherEtudiant/{idU}")
    public Universite findByIdUniversite(@PathVariable("idU") int idUniversite) {
        return universiteService.findByIdUniversite(idUniversite);
    }
}
