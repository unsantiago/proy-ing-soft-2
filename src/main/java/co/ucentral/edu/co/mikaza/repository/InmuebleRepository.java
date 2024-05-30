package co.ucentral.edu.co.mikaza.repository;

import co.ucentral.edu.co.mikaza.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
    Inmueble findByDireccion(String direccion);
}
