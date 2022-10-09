package com.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner in =new  Scanner(System.in);
        System.out.print("Enter the length of holo-daimond : ");
        int n = in.nextInt();

        int st = n/2 + 1;
        int sp = 1;

        if(n % 2 != 0){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= st; j++){
                    System.out.print("*\t");
                }
                for(int j = 1; j<= sp; j++){
                    System.out.print("\t");
                }
                for(int j = 1; j <= st; j++){
                    System.out.print("*\t");
                }

                if(i <= n / 2){
                    st--;
                    sp +=2;
                } else{
                    st++;
                    sp -=2;
                }

                System.out.println();
            }

        }
        else{
            System.out.println("Enter an ODD number !!! Try Again");
        }

        in.close();
    }
}
