import java.util.Scanner;

public class IT26102178Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, average;
        String grade;

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            mark1 = sc.nextDouble();
            mark2 = sc.nextDouble();
            mark3 = sc.nextDouble();
            mark4 = sc.nextDouble();

            if ((mark1 < 0 || mark1 > 100) ||
                (mark2 < 0 || mark2 > 100) ||
                (mark3 < 0 || mark3 > 100) ||
                (mark4 < 0 || mark4 > 100)) {

                System.out.println("Invalid Marks");
                return;
            }

            average = (mark1 + mark2 + mark3 + mark4) / 4;

            System.out.println("Average is : " + average);

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        sc.close();
    }
}
