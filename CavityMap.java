
import java.util.Scanner;
/*
Filter all matrix indexes that are at the periphery. 
For all the rest choose one index and compare its value with all neighbours (left, right, up, down). 
If it is greater than all neighbours, replace it with 'X'.
*/
public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String grid[] = new String[n];
		for(int grid_i=0; grid_i < n; grid_i++){
		    grid[grid_i] = in.next();
		}
		for(int i = 0; i < n; i++) {
		    for(int j = 0; j < grid[i].length() ; j++){
			if(i == 0 || i == n - 1 || j == 0 || j == grid[i].length() - 1){
			    System.out.print(grid[i].substring(j, j + 1));
			}
			else{
			    String mid = grid[i].substring(j, j + 1);
			    String top = grid[i - 1].substring(j, j + 1);
			    String bot = grid[i + 1].substring(j, j + 1);
			    String left = grid[i].substring(j - 1, j);
			    String right = grid[i].substring(j + 1, j + 2);
			    if(mid.compareTo(top) > 0 && mid.compareTo(bot) > 0 && mid.compareTo(left) > 0 && mid.compareTo(right) > 0){
				System.out.print("X");
			    }
			    else{
				System.out.print(grid[i].substring(j, j + 1));
			    }
			}
		    }
		    System.out.println();
		}
	}

}
