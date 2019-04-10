import java.util.Scanner;

public class HaufeDice {
    public static void main(String[] args) {
        int n = 0;
        Dice wuerfel = new Dice(1);

        while (n == 0) {
            int ocome = wuerfel.rolldice();//Roll 2 Dice and save outcome

            Scanner scan = new Scanner(System.in);

            System.out.print("Guesss the outcome.");//Ask user what he/she thinks is thrown
            int x = 0;

            while (x == 0) {
                int num = scan.nextInt();

                System.out.println("The number entered by user: " + num);


                if (num < ocome) {
                    System.out.println("The outcome is higher than your guess. Do you want to guess again? 'y' or 'n'");
                    x = guessquestion(scan, ocome);

                } else if (num > ocome) {
                    System.out.println("The outcome is lower than your guess. Do you want to guess again? 'y' or 'n'");
                    x = guessquestion(scan, ocome);

                } else if (num == ocome) {
                    System.out.println("Congratulations, you guessed right :D ");
                    x = 1;
                }
            }

            System.out.print("Roll Dice again? Type 'y' for Yes and 'n' for No.");


            String userinput = scan.next();

            if (userinput.equals("y")) {
                n = 0;
            } else if (userinput.equals("n")) {
                n = 1;
                System.out.println("Bye");
            } else {
                System.out.println("Error 404: Please type in 'y' or 'n'!");
            }


        }


    }

    public static int guessquestion(Scanner scan, int ocome) {

        int x = 0;
        String userinput = scan.next();

        if (userinput.equals("y")) {
            x = 0;
        } else if (userinput.equals("n")) {
            System.out.println("The outcome is " + ocome);
            x = 1;
        } else {
            System.out.println("Error 404: Please type in 'y' or 'n'!");
        }
        return x;
    }
}
