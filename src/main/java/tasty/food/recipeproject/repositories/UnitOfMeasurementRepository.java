package tasty.food.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tasty.food.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
