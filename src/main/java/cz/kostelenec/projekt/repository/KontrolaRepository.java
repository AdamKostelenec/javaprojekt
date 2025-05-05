package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Kontrola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontrolaRepository extends JpaRepository<Kontrola,Long> {
}
