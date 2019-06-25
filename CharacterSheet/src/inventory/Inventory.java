package inventory;

import java.util.ArrayList;

public class Inventory {
	private static ArrayList<Item> inventory;
	
	public static void main( String[] args )
	{
		inventory = new ArrayList<Item>();
		Item item1 = new Item( "apple" );
		inventory.add(item1);
		System.out.print(inventory.get(0).getName());
	}

}
