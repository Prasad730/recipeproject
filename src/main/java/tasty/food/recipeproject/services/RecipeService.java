package tasty.food.recipeproject.services;

import tasty.food.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
