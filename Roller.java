import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int intDiceRoll = 0;
        int intDiceFaces = 0;
        int intSum = 0;
        double dblAverage = 0.0;

        Scanner userInput = new Scanner(System.in);

        try {

            System.out.println("Enter the number of dice to roll: ");

            intDiceRoll = userInput.nextInt();

        } catch(InputMismatchException e) {

            System.out.println("Input Mismatch Exception! Integer Only!");

        }

        try {

            System.out.println("Enter the number of faces for dices: ");

            intDiceFaces = userInput.nextInt();

        } catch(InputMismatchException e) {

            System.out.println("Input Mismatch Exception! Integer Only!");

        }

        int[] intDiceArray = new int[intDiceRoll];

        for(int i = 0; i < intDiceRoll; i++){

            int intRandomNumber = (int)(Math.random() * (intDiceFaces) + 1);

            intDiceArray[i] = intRandomNumber;

        }

        Arrays.sort(intDiceArray);

        for(int i = 0; i < intDiceRoll; i++){

            System.out.print(intDiceArray[i] + " ");

            intSum = intDiceArray[i] + intSum;

        }

        dblAverage = (double)intSum/intDiceRoll;

        System.out.println("");
        System.out.println("Sum: " + intSum);
        System.out.println("Average: " + dblAverage);

    }
}
