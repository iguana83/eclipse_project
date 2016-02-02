package java_for_begginers;

public class Arays_of_strings {

	public static void main(String[] args) {
		String [] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println();
		
		String[] fruits = {"apple", "banana", "pear"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
			
		}
		
		int[] numbers = {2, 5, 7, 9};
		
		for(int number: numbers) {
			System.out.println(number);
		}
		
		String[] names = new String[3];
		
		names[0] = "Anna";
		names[1] = "Boris";
		names[2] = "Ira";
		
		for(String name: names){
			System.out.println(name);
			
		}
	}
}
