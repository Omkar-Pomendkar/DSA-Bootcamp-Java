package programs.practiceset1;

import java.util.Scanner;

public class osp_ps2 {
    public static void main(String[] args) {
        System.out.println("Write a program to calculate CGPA using marls of 3 Subject");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        float Total = (num1 + num2 + num3);
        float Average = (Total/3);
        System.out.println(Average);
    }
}
