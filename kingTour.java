//date: 8/1/2023
//status: Solved

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class kingTour
{
	static int kingTr(int n,int m){
	    return (n*5)+(m*7);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
		//kingTour tr = new kingTour();
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
            int m = sc.nextInt();
		    System.out.println(kingTr(n,m));
		}
        sc.close();
	}
}