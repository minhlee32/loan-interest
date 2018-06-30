import java.util.Scanner;

public class LoanInterest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Please enter number of months: ");
        month = input.nextInt();

        System.out.println("Please enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();

        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);

    }
}
