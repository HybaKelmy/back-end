package com.esprit.backend.Services;


import com.esprit.backend.Entity.Reclamation;
import com.esprit.backend.Entity.StatutReclamation;
import com.esprit.backend.Entity.User;
import com.esprit.backend.Repository.ReclamationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReclamationService implements IReclamationService{
    private final  ReclamationRepository reclamationRepository;
    @Override
    public Reclamation ajouterReclamation(Reclamation reclamation){
        reclamation = reclamationRepository.save(reclamation);
        return reclamation;
    }


    @Override
public List<Reclamation> getAllReclamation() {
        return (List<Reclamation>) reclamationRepository.findAll();
    }

}
