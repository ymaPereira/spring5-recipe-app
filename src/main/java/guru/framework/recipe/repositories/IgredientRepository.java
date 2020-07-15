package guru.framework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipe.domain.Ingredient;

public interface IgredientRepository extends CrudRepository<Ingredient, Long>{

}
