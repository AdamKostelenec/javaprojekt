package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Palivo;
import cz.kostelenec.projekt.repository.PalivoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paliva")
@CrossOrigin(origins = "*")
public class PalivoController {
    private final PalivoRepository palivoRepository;

    public PalivoController(PalivoRepository palivoRepository) {
        this.palivoRepository = palivoRepository;
    }

    @GetMapping
    public List<Palivo> getAll() {
        return palivoRepository.findAll();
    }

    @PostMapping
    public Palivo save(@RequestBody Palivo palivo) {
        return palivoRepository.save(palivo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        palivoRepository.deleteById(id);
    }
}