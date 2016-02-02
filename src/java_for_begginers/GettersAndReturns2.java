package java_for_begginers;

class Job{
	String title;
	int salary;
	int eoh;
	
	int calculateAnnualSalary(){
		int annualSalary = salary * 12;
		return annualSalary;
	}
	
	String getTitle(){
		return title;
	}
	
}

public class GettersAndReturns2 {

	public static void main(String[] args) {
		Job job1 = new Job();
		job1.title = "QA";
		job1.salary = 5000;
		job1.eoh = 2012;
		
		int annualSalary = job1.calculateAnnualSalary();
        
        String title = job1.getTitle();
        
        System.out.println("Looking for a " + title + " with the annual salary " + annualSalary);
        
	}

}
