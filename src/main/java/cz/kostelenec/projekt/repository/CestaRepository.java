package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Cesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CestaRepository extends JpaRepository<Cesta,Long> {
}
