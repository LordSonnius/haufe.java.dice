import java.util.Scanner;

public class HaufeDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter how many sides your dices have.");
        int diceside = scan.nextInt();

        boolean userIsPlaying = true;
        while (userIsPlaying) {
            int Result = rollDice(diceside);//Roll 2 Dice and save result

            boolean userIsTrying = true;
            while (userIsTrying) {

                System.out.print("Guesss the result.");//Ask user what he/she thinks is thrown
                int num = scan.nextInt();
                System.out.println("The number entered by user: " + num);

                if (num < Result) {
                    System.out.println("The result is higher than your guess. Do you want to guess again? 'y' or 'n'");
                    userIsTrying = guessQuestion(scan, Result);

                } else if (num > Result) {
                    System.out.println("The result is lower than your guess. Do you want to guess again? 'y' or 'n'");
                    userIsTrying = guessQuestion(scan, Result);

                } else if (num == Result) {
                    System.out.println("Congratulations, you guessed right :D ");
                    userIsTrying = false;
                }
            }

            System.out.print("Roll Dice again? Type 'y' for Yes and 'n' for No.");
            String userinput = scan.next();
            if (userinput.equals("y")) {
                userIsPlaying = true;
            } else if (userinput.equals("n")) {
                userIsPlaying = false;
                System.out.println("Bye");
            } else {
                System.out.println("Error 404: Please type in 'y' or 'n'!");
            }
        }
    }

    public static boolean guessQuestion(Scanner scan, int Result) {

        boolean userIsTrying = true;
        String userinput = scan.next();

        if (userinput.equals("y")) {
            userIsTrying = true;
        } else if (userinput.equals("n")) {
            System.out.println("The result is " + Result);
            userIsTrying = false;
        } else {
            System.out.println("Error 404: Please type in 'y' or 'n'!");
            System.out.println("The result is " + Result);
            System.exit(0);
        }

        return userIsTrying;
    }

    public static int rollDice(int diceside) {
        Dice Wurf1 = new Dice(diceside);
        Dice Wurf2 = new Dice(diceside);

        int Result = Wurf1.wuerfeln() + Wurf2.wuerfeln();
        return Result;
    }
}
