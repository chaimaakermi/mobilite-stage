package com.example.mobiliteinternational.controller;

import com.example.mobiliteinternational.entity.Etudiant;
import com.example.mobiliteinternational.service.etudiant.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    private final IEtudiantService etudiantService;

    @PostMapping("/ajouterEtudiant")
    public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }


    @PutMapping("/modifierEtudiant")
    public Etudiant UpdateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.UpdateEtudiant(etudiant);
    }

    @DeleteMapping("/supprimerEtudiant/{idEtudiant}")
    public void deleteEtudiant(@PathVariable("idEtudiant") int idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);

    }

    @GetMapping("/afficherAllEtudiant")
    public List<Etudiant> findAllEtudiant() {
        return etudiantService.findAllEtudiant();
    }


    @GetMapping("/afficherEtudiant/{idE}")
    public Etudiant findByIdConsumer(@PathVariable("idE") int idEtudiant) {
        return etudiantService.findByIdEtudiant(idEtudiant);
    }

}
