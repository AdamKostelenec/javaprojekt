package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Cesta;
import cz.kostelenec.projekt.repository.CestaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cesty")
@CrossOrigin(origins = "*")
public class CestaController {
    private final CestaRepository cestaRepository;

    public CestaController(CestaRepository cestaRepository) {
        this.cestaRepository = cestaRepository;
    }

    @GetMapping
    public List<Cesta> getAll() {
        return cestaRepository.findAll();
    }

    @PostMapping
    public Cesta save(@RequestBody Cesta cesta) {
        return cestaRepository.save(cesta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cestaRepository.deleteById(id);
    }
}
