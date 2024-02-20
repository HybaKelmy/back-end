package com.esprit.backend.Controller;

import com.esprit.backend.Entity.Reclamation;
import com.esprit.backend.Entity.StatutReclamation;
import com.esprit.backend.Entity.User;
import com.esprit.backend.Services.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reclamation")
public class ReclamationController {
    @Autowired
    ReclamationService serviceReclamation;
    @PostMapping("/add")
    public Reclamation ajouterReclamation(@RequestBody Reclamation reclamation){
        User user = reclamation.getUser();
        reclamation.setUserLastname(user.getLastname());
        reclamation.setUserFirstname(user.getFirstname());
        reclamation.setUserEmail(user.getEmail());
        reclamation.setStatutReclamation(StatutReclamation.EN_ATTENTE); // Définir le statut à EN_ATTENTE
        reclamation.setDateCreation(new Date());
        return serviceReclamation.ajouterReclamation(reclamation);
    }


    @GetMapping("/consultrec")
    public List<Reclamation> getAllReclamation() {
        List<Reclamation> reclamation = serviceReclamation.getAllReclamation();
        return reclamation;
    }

    @GetMapping("/status")
    public List<Reclamation> getRecByStatus(@RequestParam boolean status) {
        return serviceReclamation.getRecByStatus(status);
    }
}
