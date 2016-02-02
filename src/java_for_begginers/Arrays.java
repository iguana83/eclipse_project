package java_for_begginers;

public class Arrays {

	public static void main(String[] args) {
		
		int [] numbers = {10, 20, 30};
		
		for(int i = 0; i < numbers.length; i++){
			
			System.out.println(numbers[i]);
		}
		
		String [] answers = {"yes", "no"}; 
		System.out.println(answers[1]);
		
		int [] values; 
		values = new int[3];
		
		values[0] = 15;
		values[1] = 20;
		values[2] = 25;
		
			for(int i = 0; i < values.length; i++){
				
				System.out.println(values[i]);
			}
		

	}

}
