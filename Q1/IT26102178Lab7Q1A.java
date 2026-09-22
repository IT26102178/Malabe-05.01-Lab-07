import java.util.Scanner;

public class IT26102178Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, average ;
        String grade ;

        System.out.print("Enter Subject Mark 1: ");
        mark1 = sc.nextDouble();

        if ((mark1 < 0) || (mark1 > 100)) {
        System.out.println("Invalid Marks") ;
        return;
       }

        System.out.print("Enter Subject Mark 2: ");
        mark2 = sc.nextDouble();

        if ((mark2 < 0) || (mark2 > 100)) {
        System.out.println("Invalid Marks") ;
        return;
       }

        System.out.print("Enter Subject Mark 3: ");
        mark3 = sc.nextDouble();

        if ((mark3 < 0) || (mark3 > 100)) {
        System.out.println("Invalid Marks") ;
        return;
       }

        System.out.print("Enter Subject Mark 4: ");
        mark4 = sc.nextDouble();

       if ((mark4 < 0) || (mark4 > 100)) {
        System.out.println("Invalid Marks") ;
        return;
       }

        average = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println() ;

        System.out.println("Average is: " + average);

        if (average >= 75) {
            grade = ("Distinction") ;
        } else if (average >= 50) {
            grade = ("Credit");
        } else {
            grade = ("Fail");
        }
         System.out.println("Overall Grade is : " + grade);

        sc.close();
    }
}
