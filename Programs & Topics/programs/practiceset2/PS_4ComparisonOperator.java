package programs.practiceset2;

import java.util.Scanner;

public class PS_4ComparisonOperator {
    public static void main(String[] args) {
        System.out.println("Number is Greater or Not");
        int Number = 10 ;
        Scanner sc = new Scanner(System.in);
        int usernumber = sc.nextInt();
        if(usernumber > Number)
        {
            System.out.println(usernumber);
        }

    }
}
