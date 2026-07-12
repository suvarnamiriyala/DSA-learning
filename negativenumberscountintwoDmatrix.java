import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[][] grid = new int[n][n];
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            grid[i][j] = sc.nextInt();
            if(grid[i][j] < 0){
                count++;
            }
        }
    }
    System.out.println(count);
	}
}
