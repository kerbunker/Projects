package Items;

public class craftedItem {
	String name;
	int level;
	String crafter;
	Material materialsList[];
	
	public craftedItem(String name, int level, String crafter, int numMat) {
		this.name = name;
		this.level = level;
		this.crafter = crafter;
		materialsList = new Material[numMat];
	}
	
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public String crafter() {
		return crafter;
	}
	public int getNumMaterials() {
		return materialsList.length;
	}
	public void addMaterial(Material mat, int index) {
		materialsList[index] = mat;
	}
	public Material getMaterial(int index) {
		return materialsList[index];
	}

}
