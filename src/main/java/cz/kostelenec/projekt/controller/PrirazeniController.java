package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Prirazeni;
import cz.kostelenec.projekt.repository.PrirazeniRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prirazeni")
@CrossOrigin(origins = "*")
public class PrirazeniController {
    private final PrirazeniRepository prirazeniRepository;

    public PrirazeniController(PrirazeniRepository prirazeniRepository) {
        this.prirazeniRepository = prirazeniRepository;
    }

    @GetMapping
    public List<Prirazeni> getAll() {
        return prirazeniRepository.findAll();
    }

    @PostMapping
    public Prirazeni save(@RequestBody Prirazeni prirazeni) {
        return prirazeniRepository.save(prirazeni);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        prirazeniRepository.deleteById(id);
    }
}
