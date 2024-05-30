package co.ucentral.edu.co.mikaza.repository;

import co.ucentral.edu.co.mikaza.model.Anfitrion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnfitrionRepository extends JpaRepository<Anfitrion, Long> {

}
