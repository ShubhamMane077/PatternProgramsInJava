package com.numberpatterns;
import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Enter value for n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else 
                    System.out.print("0 ");
            
            }
            System.out.println();
        }
        sc.close();
    }
}