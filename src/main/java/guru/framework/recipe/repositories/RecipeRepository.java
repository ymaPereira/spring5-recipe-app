package guru.framework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
