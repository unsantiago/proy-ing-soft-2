package co.ucentral.edu.co.mikaza.controller;

import co.ucentral.edu.co.mikaza.exception.ResourceNotFoundException;
import co.ucentral.edu.co.mikaza.model.Ciudad;
import co.ucentral.edu.co.mikaza.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadRepository ciudadRepository;

    @GetMapping
    public List<Ciudad> getAllCiudades() {
        return ciudadRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> getCiudadById(@PathVariable(value = "id") Long ciudadId) {
        Ciudad ciudad = ciudadRepository.findById(ciudadId)
                .orElseThrow(() -> new ResourceNotFoundException("Ciudad not found with id: " + ciudadId));
        return ResponseEntity.ok().body(ciudad);
    }

}
