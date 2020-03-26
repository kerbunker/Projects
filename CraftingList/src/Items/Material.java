package craftingList;

public class Material {
	String name;
	int level;
	String gatherer;
	
	public Material( String name, int level, String gatherer )
	{
		this.name = name;
		this.level = level;
		this.gatherer = gatherer;
	}
	
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public String getGatherer() {
		return gatherer;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Level: "+ level);
		System.out.println("Gatherer: " + gatherer);
	}

}