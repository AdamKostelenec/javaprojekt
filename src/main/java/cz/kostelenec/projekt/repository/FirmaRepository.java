package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Firma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmaRepository extends JpaRepository<Firma, Long> {
}
