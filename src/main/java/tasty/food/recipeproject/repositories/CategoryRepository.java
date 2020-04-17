package tasty.food.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tasty.food.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
