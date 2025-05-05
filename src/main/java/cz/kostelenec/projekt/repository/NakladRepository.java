package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Naklad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NakladRepository extends JpaRepository<Naklad,Long> {
}
