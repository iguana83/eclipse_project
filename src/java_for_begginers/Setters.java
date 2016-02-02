package java_for_begginers;

class Me {
	String name;
	int age;
	
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	void setName(String myName){
		name = myName;
	}
	void setAge(int age){
		this.age = age;
	}
	void greeting(String name){
		System.out.println("Hello, " + name);
	}
}
public class Setters {

	public static void main(String[] args) {
		
		Me me1 = new Me();
		me1.setName("Sveta");
		me1.setAge(33);
		me1.greeting(me1.getName()); 
	}

}
