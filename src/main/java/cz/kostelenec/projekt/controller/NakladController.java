package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Naklad;
import cz.kostelenec.projekt.repository.NakladRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/naklady")
@CrossOrigin(origins = "*")
public class NakladController {
    private final NakladRepository nakladRepository;

    public NakladController(NakladRepository nakladRepository) {
        this.nakladRepository = nakladRepository;
    }

    @GetMapping
    public List<Naklad> getAll() {
        return nakladRepository.findAll();
    }

    @PostMapping
    public Naklad save(@RequestBody Naklad naklad) {
        return nakladRepository.save(naklad);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        nakladRepository.deleteById(id);
    }
}
