package guru.framework.recipe.botstrap;

import org.springframework.boot.CommandLineRunner;

import guru.springframework.recipe.domain.Category;

public class Bootsrap implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		new Category();
	}

}
