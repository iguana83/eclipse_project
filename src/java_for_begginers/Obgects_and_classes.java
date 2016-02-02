package java_for_begginers;


class Animal {
	
	String name;
	int age;
	String color;
	
}


class Car {
	
	String model;
	String year;
	String color;
	
}


class Friend {
	
	int age;
	int weight; 
	
}

public class Obgects_and_classes {

	public static void main(String[] args) {
		
		Animal panda = new Animal();
		panda.name = "Hu";
		panda.age = 15;
		panda.color = "black and wite";
		
		Car honda = new Car();
		honda.model = "civic";
		honda.year = "2010";
		honda.color = "silver";
		
		Friend Oksana = new Friend();
		Oksana.age = 48;
		Oksana.weight = 72; 
		

	}

}
