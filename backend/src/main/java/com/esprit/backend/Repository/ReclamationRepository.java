package com.esprit.backend.Repository;

import com.esprit.backend.Entity.Reclamation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReclamationRepository extends CrudRepository<Reclamation,Long> {

}
