import java.util.Scanner;

public class IT26102178Lab7Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalamount, discount, finalamount;
        char paymode;

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            totalamount = sc.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymode = sc.next().charAt(0);

            if (paymode == 'C' || paymode == 'c') {

                discount = totalamount * 5 / 100;
                finalamount = totalamount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + finalamount);

            } else if (paymode == 'O' || paymode == 'o') {

                finalamount = totalamount;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + finalamount);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        sc.close();
    }
}
