package com.starpatterns;
import java.util.*;

public class Pattern5 {
	
    public static void main(String[] args) {
        int i,j,n=0;
        
        System.out.print("Enter value For n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i=n;i>0;i--){
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}


