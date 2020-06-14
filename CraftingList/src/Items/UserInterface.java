package craftingList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Class to handle the user interface with the console until a GUI has been made.
 * @author Katelyn Bunker
 *
 */
public class UserInterface {
	
	static ArrayList<Material> materialsList;
	
	public static void createMaterial( String name, int level, String gatherer ) {
		
		Material newMaterial = new Material( name, level, gatherer);
		
		if( materialsList.isEmpty() ) {
			materialsList.add(newMaterial);
		} else {
			ListIterator<Material> iterator = materialsList.listIterator();
			Material current;
			int index = 0;
			boolean found = false;
			while(iterator.hasNext() && !found ) {
				current = iterator.next();
				if(current.getLevel() > level) {
					found = true;
					index = iterator.nextIndex() - 1;
				} 
			}
			if( !found) {
				index = iterator.nextIndex();
			}
			materialsList.add(index, newMaterial);
			
		}
	}
	
	public static void printMatList() {
		if(materialsList.isEmpty()) {
			System.out.println("There are no materials");
		} else {
			ListIterator<Material> iterator = materialsList.listIterator();
			Material current;
			//current.print();
			System.out.println();
			while(iterator.hasNext()) {
				current = iterator.next();
				current.print();
				System.out.println();
			}
		
			
		}
	}
	
	public static Material searchMaterials(String searchName) {
		if (materialsList.isEmpty()) {
			return null;
		} else {
			ListIterator<Material> iterator = materialsList.listIterator();
			while(iterator.hasNext()) {
				Material current = iterator.next();
				if(current.getName().compareTo(searchName) == 0) {
					return current;
				}
			}
		}
		return null;
	}

	
	public static void exitSystem() {
		//do whatever needs to be done
	}
	public static void main(String[] args) {
		
		materialsList = new ArrayList<Material>();
		//Scanner fileReader = new Scanner("inputFile.txt");
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like to do? (new mat, new craft, new craft list, get craft, get mat, get mat list, exit)\n");
		while(input.hasNext()) {
			
			String userInput = input.nextLine();
			if( userInput.compareTo("exit")==0){
				exitSystem();
				break;
			} else if ( userInput.compareTo("new mat")==0) {
				System.out.println("Name?");
				String name = input.nextLine();
				System.out.println("Level?");
				int level = input.nextInt();
				System.out.println("How is it gathered?");
				String gatherer = input.next();
				createMaterial(name, level, gatherer);
			} else if(userInput.compareTo("new mat list")==0) {
				System.out.println("How many?");
				int craftNum = input.nextInt();
				//Need to add check for if there are enough crafted items in the list already
				String craftNames[craftNum] = new String[craftNum];
				for( int i = 0; i < craftNum, i++ ) {
					System.out.println("Name of first craft?");
					craftNames[i] = input.nextLine();
				}
				//Add in method to create Craftinglist
			} else if( userInput.compareTo("get mat")==0) {
				System.out.println("Do you want all materials or search by name?");
				userInput = input.nextLine();
				if(userInput.compareTo("all")==0) {
					printMatList();
				} else {
					System.out.println("What is the name you're searching for?");
					String searchName = input.nextLine();
					Material result = searchMaterials(searchName);
					if(result == null) {
						System.out.println("That material was not found.");
					} else {
						result.print();
					}
				}
			} else if( userInput.compareTo("get mat list")==0) {
				
			}
			System.out.print("What would you like to do? (new mat, new craft, get craft, get mat, exit)\n");
		}
		
		
		
		input.close();
		//fileScanner.close();
	}

}
