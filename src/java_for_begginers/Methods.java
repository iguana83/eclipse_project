package java_for_begginers;

class Person {
	String name;
	int age;	
	
	void speak(){
		System.out.println("Hello, my name is " + name + " and my age is " + age);	
	}
	void sing() {
		System.out.println("Lalalala");
	}
	void scream(){
		System.out.println("AAAAAAAAA");
	}
	void cry(){
		System.out.println("sobsobsob");
	}
}




public class Methods {

	public static void main(String[] args) {
	
		Person person1 = new Person();
		person1.name = "Marina";
		person1.age = 35;
		person1.speak();
		person1.sing();
		
		Person person2 = new Person();
		person2.name = "Vova";
		person2.age = 27;
		person2.speak();
		person2.scream();
		
		Person person3 = new Person();
		person3.name = "Sveta";
		person3.age = 34;
		person3.speak();
		person3.cry();
		

	}

}
