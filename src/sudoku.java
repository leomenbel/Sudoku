import java.util.HashSet;
import java.util.Set;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
						{'.', '.', '6', '.', '.', '.', '.', '.', '.'},
						{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
						{'.', '.', '1', '.', '.', '.', '.', '.', '.'},
						{'.', '6', '7', '.', '.', '.', '.', '.', '9'},
						{'.', '.', '.', '.', '.', '.', '8', '1', '.'},
						{'.', '3', '.', '.', '.', '.', '.', '.', '6'},
						{'.', '.', '.', '.', '5', '7', '.', '.', '.'},
						{'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
		
		System.out.println(canBeSolved(grid));
		
		

	}
	
	static boolean canBeSolved(char [][] grid){
		
		for(int i = 0; i < grid.length; i++){
			Set<Character> set = new HashSet<Character>();
			Set<Character> set2 = new HashSet<Character>();
			Set<Character> set3 = new HashSet<Character>();
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j] != '.'){
					if (set.contains(grid[i][j]))
						return false;
					else
						set.add(grid[i][j]);
					
				}
				if(grid[j][i] != '.'){
					if (set2.contains(grid[j][i]))
						return false;
					else
						set2.add(grid[j][i]);
					
				}
				if(grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3] != '.'){
					if (set3.contains(grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3]))
						return false;
					else
						set3.add(grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3]);
					
				}
			}
		}
		
		
		
		
		return true;
	}
	
	

}
