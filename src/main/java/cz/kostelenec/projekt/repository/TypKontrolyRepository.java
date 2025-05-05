package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.TypKontroly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypKontrolyRepository extends JpaRepository<TypKontroly,Long> {
}
