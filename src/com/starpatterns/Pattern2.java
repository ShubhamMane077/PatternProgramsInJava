package com.starpatterns;
import java.util.*;

public class Pattern2 {
	
    public static void main(String[] args) {
        int i,j,n=0;
        
        System.out.println("Enter Vlaue For n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

