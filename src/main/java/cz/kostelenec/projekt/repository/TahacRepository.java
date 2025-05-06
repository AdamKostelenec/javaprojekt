package cz.kostelenec.projekt.repository;

import cz.kostelenec.projekt.entity.Tahac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TahacRepository extends JpaRepository<Tahac, Long> {

    // dokáže filtrovat podle String fragmentu ID
    @Query("SELECT t FROM Tahac t WHERE CAST(t.id AS string) LIKE %:frag%")
    List<Tahac> findByIdFragment(@Param("frag") String frag);


    @Query("SELECT t FROM Tahac t WHERE LOWER(t.model) LIKE LOWER(CONCAT('%', :frag, '%'))")
    List<Tahac> findByModelFragment(@Param("frag") String frag);

}
