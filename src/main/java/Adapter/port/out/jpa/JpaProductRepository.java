package Adapter.port.out.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query("""
    SELECT p
    FROM ProductEntity p
    JOIN p.category c
    WHERE p.price = :price
    AND p.dateDebut <= CURRENT_DATE
    AND p.dateFin >= CURRENT_DATE
""")
    List<ProductEntity> findProductByPriceAndDate(@Param("price") double price);
}
