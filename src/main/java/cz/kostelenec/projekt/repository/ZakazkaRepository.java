package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Zakazka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZakazkaRepository extends JpaRepository<Zakazka, Long> {
}
