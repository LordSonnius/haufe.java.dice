import java.util.Random;

public class Dice {
    int seiten;

    public  Dice(int seitiger){
        seiten = seitiger;
    }

    public int wuerfeln(){
        Random dice = new Random();
        int e = dice.nextInt(seiten)+1 ;
        return e;
    }
    public int dicen(){
        Dice Wurf1 = new Dice(6);
        Dice Wurf2 = new Dice(6);

        int Ergebnis = Wurf1.wuerfeln() + Wurf2.wuerfeln();

        System.out.println(Ergebnis);
    }


}
