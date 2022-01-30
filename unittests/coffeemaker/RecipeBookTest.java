package coffeemaker;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coffeemaker.exceptions.RecipeException;

public class RecipeBookTest {
	
	private RecipeBook recipeBook;

	@Before
	public void setUp() throws Exception {
		recipeBook = new RecipeBook();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getRecipesTest() {
		Recipe[] newValue= new Recipe[4];
		assertArrayEquals(newValue,recipeBook.getRecipes());
	}
	
	@Test
	public void addRecipesTest() {
		Recipe[] newValue= new Recipe[4];
		newValue[0]=new Recipe();
		recipeBook.addRecipe(new Recipe());
		assertArrayEquals(newValue,recipeBook.getRecipes());	
	}
	
	@Test
	public void addTwoRecipesTest() {
		Recipe[] newValue= new Recipe[4];
		newValue[0]=new Recipe();
		recipeBook.addRecipe(new Recipe());
		Recipe recipe = new Recipe();
		recipe.setName("Recipe2");
		recipeBook.addRecipe(recipe);
		newValue[1]=recipe;
		assertArrayEquals(newValue,recipeBook.getRecipes());	
	}
	
	
	@Test
	public void addDuplicateRecipesTest() {
		Recipe[] newValue= new Recipe[4];
		newValue[0]=new Recipe();
		recipeBook.addRecipe(new Recipe());
		recipeBook.addRecipe(new Recipe());
		assertArrayEquals(newValue,recipeBook.getRecipes());	
	}
	
	@Test
	public void addDuplicateRecipesReturnTest() {
		recipeBook.addRecipe(new Recipe());
		assertEquals(false,recipeBook.addRecipe(new Recipe()));	
	}
	
	@Test
	public void addFullRecipesTest() throws RecipeException {
		Recipe recipe1 = new Recipe();
		recipe1.setName("1");
		Recipe recipe2 = new Recipe();
		recipe2.setName("2");
		Recipe recipe3 = new Recipe();
		recipe3.setName("3");
		Recipe recipe4 = new Recipe();
		recipe4.setName("4");
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		recipeBook.addRecipe(new Recipe());
		assertEquals(false,recipeBook.addRecipe(recipe1));	
	}
	
	@Test
	public void addFullRecipeBookTest() throws RecipeException {
		Recipe recipe1 = new Recipe();
		recipe1.setName("1");
		Recipe recipe2 = new Recipe();
		recipe2.setName("2");
		Recipe recipe3 = new Recipe();
		recipe3.setName("3");
		Recipe recipe4 = new Recipe();
		recipe4.setName("4");
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		assertEquals(true,recipeBook.addRecipe(recipe4));	
	}
	
	@Test
	public void deleteRecipesEdgeCaseTest() {
		Recipe recipe = new Recipe();
		recipeBook.addRecipe(recipe);
		assertEquals(null,recipeBook.deleteRecipe(4));
	}
	
	@Test
	public void deleteRecipesTest() {
		Recipe recipe = new Recipe();
		recipeBook.addRecipe(recipe);
		assertEquals("",recipeBook.deleteRecipe(0));
	}
	
	@Test
	public void deleteEmptyRecipesTest() {
		assertEquals(null,recipeBook.deleteRecipe(0));
	}
	
	@Test
	public void editEmptyRecipeTest() {
		assertEquals(null,recipeBook.editRecipe(0, new Recipe()));	
	}
	
	
	@Test
	public void editRecipeTest() {
		Recipe recipe = new Recipe();
		recipe.setName("Test");
		recipeBook.addRecipe(recipe);
		Recipe recipe2 = new Recipe();
		recipeBook.editRecipe(0,recipe2 );
		assertEquals("Test",recipeBook.getRecipes()[0].getName());	
	}
	



}