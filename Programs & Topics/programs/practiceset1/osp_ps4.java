package programs.practiceset1;

import java.util.Scanner;

public class osp_ps4 {
    public static void main(String[] args) {
        System.out.println("Kilometer to meters");
        Scanner sc = new Scanner(System.in);
        int Kilometer = sc.nextInt();
        System.out.println(Kilometer+" Kilometer");
        System.out.println(Kilometer * 1000+" meter");
    }
}
