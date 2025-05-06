package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Palivo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PalivoRepository extends JpaRepository<Palivo,Long> {
    List<Palivo> findByTahacIdOrderByDatumDesc(Long tahacId);
}
