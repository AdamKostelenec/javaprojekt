package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Kontrola;
import cz.kostelenec.projekt.repository.KontrolaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kontroly")
@CrossOrigin(origins = "*")
public class KontrolaController {
    private final KontrolaRepository kontrolaRepository;

    public KontrolaController(KontrolaRepository kontrolaRepository) {
        this.kontrolaRepository = kontrolaRepository;
    }

    @GetMapping
    public List<Kontrola> getAll() {
        return kontrolaRepository.findAll();
    }

    @PostMapping
    public Kontrola save(@RequestBody Kontrola kontrola) {
        return kontrolaRepository.save(kontrola);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        kontrolaRepository.deleteById(id);
    }
}