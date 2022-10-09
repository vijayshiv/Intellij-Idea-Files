package com.Patterns;

import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of diamond : ");
        int n = in.nextInt();

        int sp = n/2;
        int st = 1;

        if(n % 2 != 0){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= sp; j++){
                    System.out.print("\t");
                }
                for(int j = 1; j <= st; j++){
                    System.out.print("*\t");
                }

                if(i <= n / 2){
                    sp--;
                    st +=2;
                } else{
                    sp++;
                    st -=2;
                }

                System.out.println();
            }
        } else{
            System.out.println("Enter an ODD number !!! Try Again");
        }

        in.close();
    }
}
