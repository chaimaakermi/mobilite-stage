package com.example.mobiliteinternational.controller;

import com.example.mobiliteinternational.entity.MobiliteInternational;
import com.example.mobiliteinternational.service.mobiliteInternational.MobiliteInternationalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/mobiliteInternational")
public class MobiliteInternationalController {

    private final MobiliteInternationalService mobiliteInternationalService;

    @PostMapping("/ajouterMobiliteInternational")
    public MobiliteInternational ajouterMobiliteInternational(@RequestBody MobiliteInternational mobiliteInternational) {
        return mobiliteInternationalService.addMobiliteInternational(mobiliteInternational);
    }


    @PutMapping("/modifierMobiliteInternational")
    public MobiliteInternational UpdateMobiliteInternational(@RequestBody MobiliteInternational mobiliteInternational) {
        return mobiliteInternationalService.UpdateMobiliteInternational(mobiliteInternational);
    }

    @DeleteMapping("/supprimerMobiliteInternational/{idMI}")
    public void deleteEtudiant(@PathVariable("idMI") int idMobiliteInternational) {
        mobiliteInternationalService.deleteMobiliteInternational(idMobiliteInternational);

    }

    @GetMapping("/afficherAllMobiliteInternational")
    public List<MobiliteInternational> findAllMobiliteInternational() {
        return mobiliteInternationalService.findAllMobiliteInternational();
    }


    @GetMapping("/afficherMobiliteInternational/{idMI}")
    public MobiliteInternational findByIdConsumer(@PathVariable("idMI") int idMobiliteInternational) {
        return mobiliteInternationalService.findByIdMobiliteInternational(idMobiliteInternational);

    }


}
