package cz.kostelenec.projekt.controller;

import cz.kostelenec.projekt.entity.Servis;
import cz.kostelenec.projekt.repository.ServisRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Servisy")
@CrossOrigin(origins = "*")
public class ServisController {
    private final ServisRepository servisRepository;

    public ServisController(ServisRepository servisRepository) {
        this.servisRepository = servisRepository;
    }

    @GetMapping
    public List<Servis> getAll() {
        return servisRepository.findAll();
    }

    @PostMapping
    public Servis save(@RequestBody Servis servis) {
        return servisRepository.save(servis);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        servisRepository.deleteById(id);
    }
}