import java.util.*;

public class ageLimit {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		if(0<T && T<1001){
		for(int i=0;i<T;i++){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int a = s.nextInt();
		    if(20<=x && x<=40 && 20<=y && y<=40 && 10<=a && a<=50){
    		    if(a>=x && a<y)
    		        System.out.println("YES");
    	        else
    	            System.out.println("NO");
		    }
		}
	}
		s.close();
	}
}

