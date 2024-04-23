package co.ucentral.edu.co.mikaza.controller;

import co.ucentral.edu.co.mikaza.exception.ResourceNotFoundException;
import co.ucentral.edu.co.mikaza.model.Inmueble;
import co.ucentral.edu.co.mikaza.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inmuebles")
public class InmuebleController {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @GetMapping
    public List<Inmueble> getAllInmuebles(){
        return inmuebleRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inmueble> getInmuebleById(@PathVariable(value = "id") Long inmuebleId) {
        Inmueble inmueble = inmuebleRepository.findById(inmuebleId)
                .orElseThrow(() -> new ResourceNotFoundException("Inmueble not found with id: " + inmuebleId));
        return ResponseEntity.ok().body(inmueble);
    }

}

