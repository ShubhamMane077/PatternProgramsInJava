package com.butterfly;

public class Pattern5 {
    public static void main(String[] arsg){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print("*");

            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                    System.out.print("*");

            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
           
        }

    }



