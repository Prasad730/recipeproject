package tasty.food.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tasty.food.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasure, Long> {
}
