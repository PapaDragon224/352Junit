package coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coffeemaker.exceptions.InventoryException;

public class InventoryTest {
	private Inventory inventory;
	private final int INITIAL_COFFEE = 15;
    private final int INITIAL_MILK = 15;
    private final int INITIAL_SUGAR = 15;
    private final int INITIAL_CHOCOLATE = 15;
    private final String ADD_GOOD_INPUT = "10";
    private final int ADD_VALUE = 10;
    private final String ADD_NEGATIVE = "-10";
    private final String ADD_NON_NUMBER = "not_an_integer";
	
	@Before
	public void setUp() throws Exception {
		inventory = new Inventory();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetChocolate() {
		assertEquals(inventory.getChocolate(), INITIAL_CHOCOLATE);
	}
	
	@Test
	public void testGetMilk() {
		assertEquals(inventory.getMilk(), INITIAL_MILK);
	}
	
	@Test
	public void testGetSugar() {
		assertEquals(inventory.getSugar(), INITIAL_SUGAR);
	}
	
	@Test
	public void testGetCoffee() {
		assertEquals(inventory.getCoffee(), INITIAL_COFFEE);
	}
	
	@Test
	public void testSetChocolate() {
		int newValue = 5;
		inventory.setChocolate(newValue);
		assertEquals(inventory.getChocolate(), newValue);
	}
	
	@Test
	public void testSetMilk() {
		int newValue = 5;
		inventory.setMilk(newValue);
		assertEquals(inventory.getMilk(), newValue);
	}
	
	@Test
	public void testSetSugar() {
		int newValue = 5;
		inventory.setSugar(newValue);
		assertEquals(inventory.getSugar(), newValue);
	}
	
	@Test
	public void testSetCoffee() {
		int newValue = 5;
		inventory.setCoffee(newValue);
		assertEquals(inventory.getCoffee(), newValue);
	}
	
	@Test
	public void testAddChocolate() throws Exception {
		inventory.addChocolate(ADD_GOOD_INPUT);
		assertEquals(inventory.getChocolate(), INITIAL_CHOCOLATE + ADD_VALUE);
	}
	
	@Test
	public void testAddMilk() throws Exception {
		inventory.addMilk(ADD_GOOD_INPUT);
		assertEquals(inventory.getMilk(), INITIAL_MILK + ADD_VALUE);
	}
	
	@Test
	public void testAddSugar() throws Exception {
		inventory.addSugar(ADD_GOOD_INPUT);
		assertEquals(inventory.getSugar(), INITIAL_SUGAR + ADD_VALUE);
	}
	
	@Test
	public void testAddCoffee() throws Exception {
		inventory.addCoffee(ADD_GOOD_INPUT);
		assertEquals(inventory.getCoffee(), INITIAL_COFFEE + ADD_VALUE);
	}
	
	@Test
	public void testAddChocolateNonNumber() throws Exception {
		assertThrows(InventoryException.class, () -> inventory.addChocolate(ADD_NON_NUMBER));
	}
	
	@Test
	public void testAddMilkNonNumber() throws Exception {
		assertThrows(InventoryException.class, () -> inventory.addMilk(ADD_NON_NUMBER));
	}
	
	@Test
	public void testAddSugarNonNumber() throws Exception {
		assertThrows(InventoryException.class, () -> inventory.addSugar(ADD_NON_NUMBER));
	}
	
	@Test
	public void testAddCoffeeNonNumber() throws Exception {
		assertThrows(InventoryException.class, () -> inventory.addCoffee(ADD_NON_NUMBER));
	}
}
