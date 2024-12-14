package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
       System.out.println(" ");

        for (int i = 0; i < row; i++) {
            for (int j = 1; j <i+2; j++) {
                System.err.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
