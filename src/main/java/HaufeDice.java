import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HaufeDice {

    public static void main(String[] args) {

        Dice wuerfel = new Dice(1);
        wuerfel.rolldice();

        System.out.println("Throw Dice again? Type 'y' for Yes and 'N' for No.");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            String userinput = reader.readLine();

            if (userinput.equals("y")){
                wuerfel.rolldice();
            }
            else {
                System.out.println("Bye");
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
