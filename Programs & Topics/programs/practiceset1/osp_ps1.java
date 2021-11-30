package programs.practiceset1;

import java.util.Scanner;

public class osp_ps1 {
    public static void main(String[] args) {
        // Q : Write a Program to sum 3 Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1+num2+num3;
        System.out.println("Total : "+sum);
    }
}
