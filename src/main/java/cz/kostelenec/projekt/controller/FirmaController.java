
package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Firma;
import cz.kostelenec.projekt.repository.FirmaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/firmy")
@CrossOrigin(origins = "*") // Povolit z webu
public class FirmaController {

    private final FirmaRepository firmaRepository;

    public FirmaController(FirmaRepository firmaRepository) {
        this.firmaRepository = firmaRepository;
    }

    @GetMapping
    public List<Firma> getAll() {
        return firmaRepository.findAll();
    }

    @PostMapping
    public Firma save(@RequestBody Firma firma) {
        return firmaRepository.save(firma);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        firmaRepository.deleteById(id);
    }
}
