package subtask1;

import java.util.Scanner;

public class ClientApp {

    static SimpleInterest objectForSimpleInterest;
    static CompoundInterest objectForCompoundInterest;

    static void displayLabel() {
        System.out.println("*********************************************************");
        System.out.println("                    InterestCalculator                   ");
        System.out.println("*********************************************************");
    }

    static void displayMenu() {
        System.out.println("1.Calculate Simple Interest");
        System.out.println("2.Calculate Coumpound Interest");
    }

    public static void main(String[] args) throws Exception {

        objectForCompoundInterest = new CompoundInterest();
        objectForSimpleInterest = new SimpleInterest();

        Double rateOfInterest;
        Integer principalAmount;
        Double periodOfInterest;

        displayLabel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
        principalAmount = input.nextInt();
        System.out.println("Enter Rate Of Interest :");
        rateOfInterest = input.nextDouble();
        System.out.println("Enter Period Of Interest :");
        periodOfInterest = input.nextDouble();

        displayMenu();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Simple Interest is : ");
                System.out.println(
                        objectForSimpleInterest.calculateInterest(rateOfInterest, principalAmount, periodOfInterest));
                break;
            case 2:
                System.out.print("Compound Interest is : ");
                System.out.println(
                        objectForCompoundInterest.calculateInterest(rateOfInterest, principalAmount, periodOfInterest));
                break;
            default:
                System.err.println("Enter Valid Operation");
        }
        input.close();
    }
}