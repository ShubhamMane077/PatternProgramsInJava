package com.starpatterns;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        int i,j,n=0;
        System.out.println("Enter value for n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<n;i++){
            for(j=1;j<n+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}



