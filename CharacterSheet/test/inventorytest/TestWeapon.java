package inventorytest;

import static org.junit.Assert.*;

import org.junit.Test;

import inventory.Weapon;

public class TestWeapon {

	@Test
	public void testSetName() {
		Weapon w1 = new Weapon();
		assertNull( w1.getName() );
		w1.setName("Longbow");
		assertEquals( "Longbow", w1.getName());
	}

	@Test
	public void testSetDesc() {
		fail("Not yet implemented");
	}

}
