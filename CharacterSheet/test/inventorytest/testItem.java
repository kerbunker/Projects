package inventorytest;

import static org.junit.Assert.*;

import org.junit.Test;

import inventory.Item;

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
	public void testSetDesc() {
		Item item1 = new Item();
		assertNull( item1.getDesc() );
		item1.setDesc("a very yummy fruit");
		assertEquals( item1.getDesc(), "a very yummy fruit" );
		item1.setDesc( "a fruit with a name that is difficult to rhyme" );
		assertEquals( item1.getDesc(), "a fruit with a name that is difficult to rhyme" );
	}

}
