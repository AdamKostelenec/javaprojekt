package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Tahac;
import cz.kostelenec.projekt.repository.TahacRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tahace")
@CrossOrigin(origins = "*") // Pro testování z frontendu
public class TahacController {

    private final TahacRepository tahacRepository;

    public TahacController(TahacRepository tahacRepository) {
        this.tahacRepository = tahacRepository;
    }

    @GetMapping
    public List<Tahac> getAll() {
        return tahacRepository.findAll();
    }

    @GetMapping("/searchById")
    public List<Tahac> getTahacById(@RequestParam String fragment) {
        return tahacRepository.findByIdFragment(fragment);
    }

    @GetMapping("/searchByModel")
    public List<Tahac> getByModel(@RequestParam String fragment) {
        return tahacRepository.findByModelFragment(fragment);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Tahac tahac) {
        Long id = tahac.getId();
        // Pokud id není null a už existuje, je to duplicita
        if (id != null && tahacRepository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Tahac s ID " + id + " již existuje.");
        }
        Tahac saved = tahacRepository.save(tahac);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!tahacRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        tahacRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
