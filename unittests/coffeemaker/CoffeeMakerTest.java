package coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeMakerTest {

	private Inventory inventory;
	private RecipeBook recipeBook;
	private Recipe recipe;
	
	
	@Before
	public void setUp() throws Exception {
		this.inventory = new Inventory();
		this.recipeBook = new RecipeBook();
		this.recipe = new Recipe();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
		
}
