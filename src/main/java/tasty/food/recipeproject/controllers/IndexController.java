package tasty.food.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tasty.food.recipeproject.domain.Category;
import tasty.food.recipeproject.domain.UnitOfMeasure;
import tasty.food.recipeproject.repositories.CategoryRepository;
import tasty.food.recipeproject.repositories.UnitOfMeasurementRepository;
import tasty.food.recipeproject.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
