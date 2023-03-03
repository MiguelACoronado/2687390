import java.util.Scanner;
import java.util.Random;

public class reto_6 {
    public static void main(String args[])
    {
        System.out.print("igrese los numeros: ");

        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();

        Random ranNum = new Random();

        System.out.print("tu resultado fue  ");
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < numberOfDice; i++) {

            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total: " + total);
        input.close();
    }
}