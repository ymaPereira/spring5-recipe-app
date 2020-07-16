package guru.springframework.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.recipe.repositories.RecipeRepository;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

	private final RecipeRepository recipeRepository;

	public RecipeController(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}
	
	@RequestMapping({"","/","/index","/index.html"})
	public String getRecipes(Model model) {		
		model.addAttribute("recipies", recipeRepository.findAll());
		return "recipe/index";
	}
}
