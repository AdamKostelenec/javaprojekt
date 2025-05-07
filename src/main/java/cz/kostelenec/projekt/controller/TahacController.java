package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Tahac;
import cz.kostelenec.projekt.repository.TahacRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tahace")
@CrossOrigin(origins = "*")
public class TahacController {

    private final TahacRepository repo;

    public TahacController(TahacRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Tahac> listAll() {
        return repo.findAll();
    }

    // --- NOVÉ ENDPOINTY PRO FILTRACI ---

    @GetMapping("/searchById")
    public List<Tahac> searchById(@RequestParam("fragment") String fragment) {
        return repo.findByIdFragment(fragment);
    }

    @GetMapping("/searchByModel")
    public List<Tahac> searchByModel(@RequestParam("fragment") String fragment) {
        return repo.findByModelFragment(fragment);
    }

    // --- EXISTUJÍCÍ CRUD OPERACE ---

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Tahac tahac) {
        Long id = tahac.getId();
        if (id != null && repo.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Tahac s ID " + id + " již existuje.");
        }
        Tahac saved = repo.save(tahac);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tahac> update(
            @PathVariable Long id,
            @RequestBody Tahac tahac
    ) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        tahac.setId(id);
        Tahac updated = repo.save(tahac);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
