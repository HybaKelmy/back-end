package com.esprit.backend.Repository;

import com.esprit.backend.Entity.Reclamation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReclamationRepository extends CrudRepository<Reclamation,Long> {
    public List<Reclamation> findByStatutReclamation(boolean status);
}
