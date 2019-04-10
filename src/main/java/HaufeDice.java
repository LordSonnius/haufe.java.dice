import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HaufeDice {

    public static void main(String[] args) {
        int n=0;
        Dice wuerfel = new Dice(1);

        while (n==0){
            wuerfel.rolldice();

            System.out.println("Roll Dice again? Type 'y' for Yes and 'n' for No.");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            try {
                String userinput = reader.readLine();

                if (userinput.equals("y")){
                    n=0;
                }
                else  if (userinput.equals("n")){
                    n=1;
                    System.out.println("Bye");
                }
                else {
                    System.out.println("Error 404: Please type in 'y' or 'n'!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }





    }
}
