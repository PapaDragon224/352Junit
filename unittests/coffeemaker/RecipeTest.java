package coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coffeemaker.exceptions.RecipeException;

public class RecipeTest {
	
	private Recipe recipe;
	
	@Before
	public void setUp() throws Exception {
		this.recipe = new Recipe();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAmtChocolate() {
		assertEquals(recipe.getAmtChocolate(), 0);
	}
	
	@Test
	public void testGetAmtCoffee() {
		assertEquals(recipe.getAmtCoffee(), 0);
	}
	
	@Test
	public void testGetAmtMilk() {
		assertEquals(recipe.getAmtMilk(), 0);
	}
	
	@Test
	public void testGetAmtSugar() {
		assertEquals(recipe.getAmtSugar(), 0);
	}
	
	@Test
	public void testGetName() {
		assertEquals(recipe.getName(), "");
	}
	
	@Test
	public void testGetPrice() {
		assertEquals(recipe.getPrice(), 0);
	}
	
	@Test
	public void testEquals() {
		assertTrue(recipe.equals(new Recipe()));
	}
	
	@Test
	public void testSetAmtChocolateNoInt() {
		assertThrows(RecipeException.class, () -> recipe.setAmtChocolate("asdasd"));
	}
	
	@Test
	public void testSetAmtChocolateNoException() throws RecipeException {
		recipe.setAmtChocolate("6");
		assertEquals(recipe.getAmtChocolate(), 6);
	}
	
	@Test
	public void testSetAmtChocolateNegativeInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtChocolate("-2"));
	}
	
	@Test
	public void testSetAmtCoffeeNoException() throws RecipeException {
		recipe.setAmtCoffee("4");
		assertEquals(recipe.getAmtCoffee(), 4);
	}
	
	@Test
	public void testSetAmtCoffeeNegativeInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtCoffee("-5"));
	}
	
	@Test
	public void testSetAmtCoffeeNoInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtCoffee("svmfd"));
	}
	
	@Test
	public void testSetAmtMilkNoException() throws RecipeException {
		recipe.setAmtMilk("5");
		assertEquals(recipe.getAmtMilk(), 5);
	}
	
	@Test
	public void testSetAmtMilkNegativeInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtMilk("-5"));
	}
	
	@Test
	public void testSetAmtMilkNoInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtMilk("sdlf"));
	}
	
	@Test
	public void testSetAmtSugarNoException() throws RecipeException {
		recipe.setAmtSugar("4");
		assertEquals(recipe.getAmtSugar(),4);
	}
	
	@Test
	public void testSetAmtSugarNegativeInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtSugar("-4"));
	}
	
	@Test
	public void testSetAmtSugarNoInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setAmtSugar("sdugk"));
	}
	
	@Test
	public void testSetName() {
		recipe.setName("SuperBad");
		assertEquals(recipe.getName(), "SuperBad");	
	}
	
	@Test
	public void testSetNameNull() {
		recipe.setName(null);
		assertEquals(recipe.getName(), "");	
	}
	
	@Test
	public void testSetPriceNoException() throws RecipeException {
		recipe.setPrice("9");
		assertEquals(recipe.getPrice(), 9);
	}
	
	@Test
	public void testSetPriceNegativeInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setPrice("-9"));
	}
	
	@Test
	public void testSetPriceNoInt() throws RecipeException {
		assertThrows(RecipeException.class, () -> recipe.setPrice("askudh"));
	}
	
	@Test
	public void testToString() {
		assertEquals(recipe.toString(), "");
	}
	
	@Test
	public void testHashCode() {
		String name = recipe.getName();
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		assertEquals(recipe.hashCode(), result);
	}
	
	@Test
	public void testHashCodeNull() {
		recipe.setName(null);
		String name = null;
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		assertEquals(recipe.hashCode(), result);
	}
	
}
