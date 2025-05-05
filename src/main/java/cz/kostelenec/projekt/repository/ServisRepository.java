package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Servis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServisRepository extends JpaRepository<Servis,Long> {
}
