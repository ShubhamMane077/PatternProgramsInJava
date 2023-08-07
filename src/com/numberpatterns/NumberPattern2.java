package com.numberpatterns;
import java.util.Scanner;

public class NumberPattern2 {
	
    public static void main(String[] args) {
        int n=0,num=1;
        System.out.println("Enter vlaue for n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
