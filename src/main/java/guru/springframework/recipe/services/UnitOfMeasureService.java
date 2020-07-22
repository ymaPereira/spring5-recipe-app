package guru.springframework.recipe.services;

import java.util.Set;

import guru.springframework.recipe.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

	Set<UnitOfMeasureCommand> listAllUoms();
}
