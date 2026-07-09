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
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    for(int i = 0 ; i < n ; i++){
        for(int j = 0; j < m ; j++){
          a[i][j] = sc.nextInt();
        }
    }
    int max = 0;
    for(int i = 0 ; i < n ; i++){
        int s = 0;
        for(int j = 0 ; j < m ; j++){
            s+=a[i][j];
        }
        if(max<s){
            max = s;
        }
    }
    System.out.println(max);
	}
}
