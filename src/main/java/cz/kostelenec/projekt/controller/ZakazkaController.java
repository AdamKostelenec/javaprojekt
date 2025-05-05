package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Zakazka;
import cz.kostelenec.projekt.repository.ZakazkaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/zakazky")
@CrossOrigin(origins = "*")
public class ZakazkaController {
    private final ZakazkaRepository zakazkaRepository;

    public ZakazkaController(ZakazkaRepository zakazkaRepository) {
        this.zakazkaRepository = zakazkaRepository;
    }

    @GetMapping
    public List<Zakazka> getAll() {
        return zakazkaRepository.findAll();
    }

    @PostMapping
    public Zakazka save(@RequestBody Zakazka zakazka) {
        return zakazkaRepository.save(zakazka);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        zakazkaRepository.deleteById(id);
    }
}