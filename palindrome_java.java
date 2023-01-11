//date: 10/1/2023
//status: Solved (pretty simply!)
//Speciality: Simple reverse append

import java.util.*;

public class palindrome_java {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String orgStr = sc.next();
        String revStr = "";

        for(int i=0;i<orgStr.length();i++){
            revStr = orgStr.charAt(i) + revStr;
        }

        if(revStr.equals(orgStr))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}

