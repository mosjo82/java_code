/* FACE JAVA Full stack Training
 * College: St.Joseph's College of Engineering
 * 
 * Question 2:
 *      Find the minimum number of coins
*/

import java.util.*;

public class minCoins{
    public static void main(String args[]){

        Scanner sco = new Scanner(System.in);
        int count=0;
        int res=0;
        int[] br = {1,2,5,10,20,50};
        int[] nor = {1,5,10,20};
        int[] us = {1,5,10,25};
        System.out.println("Enter cent value: ");
        int cent = sco.nextInt();
        System.out.println("Available Currencies: "
        +"\nBritish Pounds - B"
        +"\nNorwegian Krone - N"
        +"\nUS Dollars - U");
        System.out.println("\n");
        System.out.println("Enter the selected currency: ");
        char cur = sco.next().charAt(0);

        switch(cur){
            case 'B':
                res = coin_no(cent,count,br);
                break;
            case 'N':
                res = coin_no(cent,count,nor);
                break;
            case 'U':
                res = coin_no(cent,count,us); //correct
                break;
            default:
                System.out.println("Enter valid currency!");

        }
        // int v1 = coin_no(cent,count,arr);
        // int v2 = coin_no(rem,count,arr);
        System.out.println("The minimum no. of coins is: "+res);

        sco.close();

    }

    public static int coin_no(int cent, int count, int[] arr){

        //point last element of the array
        int ptr = arr.length-1;
        if(cent==0)
            return 0;
        
        loop:
        while(cent!=0 || 0<cent || cent<5){
            while(cent<arr[ptr]){
                ptr--;
            }
            while(cent>=arr[ptr]){
                cent = cent - arr[ptr];
                count++;
            }
            if(cent==0)break loop;
        }
        return count;
    }
}