package com.esprit.backend.Services;


import com.esprit.backend.Entity.Reclamation;
import com.esprit.backend.Entity.StatutReclamation;
import com.esprit.backend.Entity.User;
import com.esprit.backend.Repository.ReclamationRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReclamationService implements IReclamationService{
    ReclamationRepository reclamationRepository;
    @Override
    public Reclamation ajouterReclamation(Reclamation reclamation){
        User user = reclamation.getUser();
        reclamation.setUserLastname(user.getLastname());
        reclamation.setUserFirstname(user.getFirstname());
        reclamation.setUserEmail(user.getEmail());
        reclamation.setStatutReclamation(StatutReclamation.EN_ATTENTE); // Définir le statut à EN_ATTENTE
        reclamation.setDateCreation(new Date()); //
        reclamation = reclamationRepository.save(reclamation);
        return reclamation;
    }


    @Override
public List<Reclamation> getAllReclamation() {
        return (List<Reclamation>) reclamationRepository.findAll();
    }
    @Override
    public List<Reclamation> getRecByStatus(boolean status) {
        return reclamationRepository.findByStatutReclamation(status);
    }
}
