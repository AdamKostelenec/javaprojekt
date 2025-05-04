
package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Ridic;
import cz.kostelenec.projekt.repository.RidicRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ridici")
@CrossOrigin(origins = "*") // Povolit z webu
public class RidicController {

    private final RidicRepository ridicRepository;

    public RidicController(RidicRepository ridicRepository) {
        this.ridicRepository = ridicRepository;
    }

    @GetMapping
    public List<Ridic> getAll() {
        return ridicRepository.findAll();
    }

    @PostMapping
    public Ridic save(@RequestBody Ridic ridic) {
        return ridicRepository.save(ridic);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ridicRepository.deleteById(id);
    }
}
