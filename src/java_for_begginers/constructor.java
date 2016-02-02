package java_for_begginers;

class frog{
	String name;
	int age;
	public frog(String name){
		this.name = name;
	}
	
	String getName(){
	return name;
	}
	
	int getAge(){
		return age;
	}
	
	void setName(String name){
		this.name = name;		
	}
	
	void setAge(int age){
		this.age = age;
	}
	
}
public class constructor {

	public static void main(String[] args) {
	
		frog frog1 = new frog("Sveta");
        System.out.println(frog1.name);
	}

}
