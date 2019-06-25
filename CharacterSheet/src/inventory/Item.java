package inventory;

/**
 * This class contains the Item type that the character inventory is comprised of.
 * 
 * @author Katelyn
 *
 */
public class Item {
	/** The name of the item */
    private String name;
    
    /** The item's description if given */
    private String description;
    
    private int value;
    
    
    public Item()
    {
    	name = null;
    	description = null;
    	
    }
    
    /**
     * This public method allows the main class to set the name of the given item
     * @param name the name for the Item in the inventory
     */
    public void setName( String name ) {
    	
    	//sets the name of the Item
    	this.name = name;
    }
    
    /**
     * This public method allows the main class to get the name of the item
     * @return the Item's name
     */
    public String getName() {
    	
    	//returns the name of the Item
    	return name;
    }
    
    public void setDesc( String desc ) {
    	
    	description = desc;
    }
    
    public String getDesc() {
    	
    	return description;
    }
}
