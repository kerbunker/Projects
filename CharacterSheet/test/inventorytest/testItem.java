package inventorytest;

import static org.junit.Assert.*;

import org.junit.Test;

import Inventory.Item;

public class testItem {
	
	


	@Test
	public void testSetName() {
		Item item1 = new Item();
		assertNull( item1.getName() );
		item1.setName("apple");
		assertEquals( item1.getName(), "apple" );
		item1.setName( "orange" );
		assertEquals( item1.getName(), "orange" );
		
		
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDesc() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDesc() {
		fail("Not yet implemented");
	}

}
