package java_for_begginers;

public class Multidimentional_array {

	public static void main(String[] args) {
		
			
		int[][] grid = {
				{3, 5, 7},
				{9, 11},
				{13, 15, 17, 19}
				
		};
		
		
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++) {
	     
				System.out.println(grid[row][col]);
			}
			
			System.out.println();
		}
	}

}
