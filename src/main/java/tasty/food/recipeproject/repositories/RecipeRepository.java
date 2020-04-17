package tasty.food.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tasty.food.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
