
import java.util.Scanner;

public class monthlyPayment {
    static Scanner userinput = new Scanner(System.in);
    static double computePayment(
            double loanAmt,
            double rate,
            int numPeriods) {
        double interest = rate / 1200;

        numPeriods = numPeriods *12;
        double partial1 = Math.pow((1+interest), numPeriods);
        double denominator = partial1 -1;

        double numerator = partial1 * interest;
        double answer = loanAmt*(numerator/denominator);
        return answer;
    }

    public static void main (String[] args){
        System.out.println("Welcome to Monthly Mortgage Calculator");
        System.out.print ("\nEnter principle: ");
        double a = userinput.nextDouble();
        System.out.print ("Enter yearly interest rate without percent: ");
        double b = userinput.nextDouble();
        System.out.print ("Enter number of years: ");
        int c = userinput.nextInt();
        System.out.println("\nThe monthly payment is " + computePayment(a,b,c));
    }
}
