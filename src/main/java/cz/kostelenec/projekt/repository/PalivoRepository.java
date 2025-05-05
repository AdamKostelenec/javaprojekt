package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Palivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PalivoRepository extends JpaRepository<Palivo,Long> {
}
