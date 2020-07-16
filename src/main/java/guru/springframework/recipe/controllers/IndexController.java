package guru.springframework.recipe.controllers;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.recipe.domain.Category;
import guru.springframework.recipe.domain.UnitOfMeasure;
import guru.springframework.recipe.repositories.CategoryRepository;
import guru.springframework.recipe.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	
	@RequestMapping({"","/","/index","/index.html"})
	public String getIndexPage() {
		Optional<Category> cat = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> ut = unitOfMeasureRepository.findByDescription("Teaspoon");
		System.out.println("ID Cat: "+cat.get().getId());
		System.out.println("ID UT: "+ut.get().getId());
		return "index";
	}
}
