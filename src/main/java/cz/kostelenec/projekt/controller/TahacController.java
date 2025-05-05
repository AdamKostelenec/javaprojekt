    package cz.kostelenec.projekt.controller;

    import cz.kostelenec.projekt.entity.Tahac;
    import cz.kostelenec.projekt.repository.TahacRepository;
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

        @PostMapping
        public Tahac save(@RequestBody Tahac tahac) {
            return tahacRepository.save(tahac);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            tahacRepository.deleteById(id);
        }
    }
