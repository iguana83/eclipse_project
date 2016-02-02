package java_for_begginers;

class fish{
	public String name;
	public static String description; 
	
	static int count = 0;
	public int id; 
	
	public fish(){
		id = count;
		count++;
	}
	
	public void Description(){
		System.out.println("My ID is: " + id);
	
	}
	
}
public class StaticFinal {

	public static void main(String[] args) {
		
		fish fish1 = new fish();
		fish fish2 = new fish();
	    
		System.out.println("Number of objects is: " + fish.count);
		
		//fish.Description();
		
		fish1.Description();
		fish2.Description();

	}

}
