package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.TypKontroly;
import cz.kostelenec.projekt.repository.TypKontrolyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typy-kontrol")
@CrossOrigin(origins = "*")
public class TypKontrolyController {
    private final TypKontrolyRepository typRepository;

    public TypKontrolyController(TypKontrolyRepository typRepository) {
        this.typRepository = typRepository;
    }

    @GetMapping
    public List<TypKontroly> getAll() {
        return typRepository.findAll();
    }

    @PostMapping
    public TypKontroly save(@RequestBody TypKontroly typ) {
        return typRepository.save(typ);
    }
}
