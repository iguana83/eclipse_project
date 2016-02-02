package java_for_begginers;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		
		do{
			
			System.out.println("Enter a value: ");
		    number = scanner.nextInt();
		}
		while (number !=5);
		
		System.out.println("Got 5!");
	
	}
	

}