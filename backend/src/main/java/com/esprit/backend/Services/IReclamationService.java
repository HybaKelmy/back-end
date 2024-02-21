package com.esprit.backend.Services;

import com.esprit.backend.Entity.Reclamation;

import java.util.List;

public interface IReclamationService {
    Reclamation ajouterReclamation(Reclamation reclamation);

    List<Reclamation> getAllReclamation();
}
