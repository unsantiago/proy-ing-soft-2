package co.ucentral.edu.co.mikaza.repository;

import co.ucentral.edu.co.mikaza.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}
