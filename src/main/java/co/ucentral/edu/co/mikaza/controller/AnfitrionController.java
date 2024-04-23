package co.ucentral.edu.co.mikaza.controller;

import co.ucentral.edu.co.mikaza.exception.ResourceNotFoundException;
import co.ucentral.edu.co.mikaza.model.Anfitrion;
import co.ucentral.edu.co.mikaza.repository.AnfitrionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anfitriones")
public class AnfitrionController {

    @Autowired
    private AnfitrionRepository anfitrionRepository;

    @GetMapping
    public List<Anfitrion> getAllAnfitriones() {
        return anfitrionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anfitrion> getAnfitrionById(@PathVariable(value = "id") Long anfitrionId) {
        Anfitrion anfitrion = anfitrionRepository.findById(anfitrionId)
                .orElseThrow(() -> new ResourceNotFoundException("Anfitrion not found with id: " + anfitrionId));
        return ResponseEntity.ok().body(anfitrion);
    }

}


