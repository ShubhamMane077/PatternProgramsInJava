package com.numberpatterns;

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Enter value for n: ");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(j);
            System.out.println();
        }
        sc.close();

    }
}