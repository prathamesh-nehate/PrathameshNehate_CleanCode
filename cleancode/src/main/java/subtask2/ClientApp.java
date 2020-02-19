package subtask2;

import java.util.Scanner;

class ClientApp {

    static void displayLabel() {
        System.out.println("*********************************************************");
        System.out.println("                ConstructionCostCalculator               ");
        System.out.println("*********************************************************");
    }

    static void displayMenu() {
        System.out.println("List of Material Standard");
        System.out.println("1.Standard");
        System.out.println("2.Above Standard");
        System.out.println("3.High Standard");
        System.out.println("4.High Standard + Fully Automated");
    }

    public static void main(String[] args) {
        Construction objectConstruction = new Construction();
    
        displayLabel();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Carpet area of House (in square feet) : ");

        int squareFeet = input.nextInt();

        displayMenu();

        System.out.println("Select Material Standard");
        int menuEnumerationIndex = input.nextInt();

        System.out.print("Construction cost is : ");

        try {
            System.out.println(objectConstruction.calculateCostPerSquareFeet(menuEnumerationIndex, squareFeet));
        } catch (InputValueException e) {
            System.err.println(e.getMessage());;
        }

        input.close();

        
    }
}