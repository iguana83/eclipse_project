

package java_for_begginers;

 class Auto{
	
	String make;
	int year;
	
	int calculateYearsOld(){
		int yearsOld = 2016 - year;
			return yearsOld; 
	}
	
	String getMake(){
		return make; 
	}
	
	int getYear(){
		return year;
	}
}

public class GettersAndReturnValues {

	public static void main(String[] args) {
		
		Auto car1 = new Auto();
		car1.make = "Honda";
		car1.year = 2010;
		int numberOfYears = car1.calculateYearsOld();
			System.out.println(numberOfYears);
			
		int age = car1.getYear();
		
	    String make = car1.getMake();
	    
	    System.out.println("Car make is " + make);
	    System.out.println("Car DOB is " + age);
		

	}

}
