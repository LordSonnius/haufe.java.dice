import java.util.Scanner;

public class HaufeDice {

    public static void main(String[] args) {
        int n = 0;
        Dice wuerfel = new Dice(1);

        //while (n == 0) {
        int ocome = wuerfel.rolldice();//Roll 2 Dice and save outcome

        Scanner scan = new Scanner(System.in);

        System.out.print("Guesss the outcome.");//Ask user what he/she thinks is thrown

        //try {
        int num = scan.nextInt();
        scan.close();

        System.out.println("The number entered by user: " + num);
        if (num < ocome) {
            System.out.println("The outcome is higher than your guess. Do you want to guess again? 'y' or 'n'");


        } else if (num > ocome) {
            System.out.println("The outcome is lower than your guess. Do you want to guess again? 'y' or 'n'");


        } else if (num == ocome) {
            System.out.println("Congratulations, you guessed right :D ");
        }

//
//            //} catch (IOException e) {
//            //   e.printStackTrace();
//            //}
//
//
//            System.out.println("Roll Dice again? Type 'y' for Yes and 'n' for No.");
//
//            BufferedReader reader =
//                    new BufferedReader(new InputStreamReader(System.in));
//            try {
//                String userinput = reader.readLine();
//
//                if (userinput.equals("y")) {
//                    n = 0;
//                } else if (userinput.equals("n")) {
//                    n = 1;
//                    System.out.println("Bye");
//                } else {
//                    System.out.println("Error 404: Please type in 'y' or 'n'!");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        //}


    }
}
