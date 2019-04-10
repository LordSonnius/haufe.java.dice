import java.util.Random;

public class Dice {
    int seiten;

    public Dice(int diceside) {
        seiten = diceside;
    }

    public int wuerfeln() {
        Random dice = new Random();
        int e = dice.nextInt(seiten) + 1;
        return e;
    }

    public int rolldice() {
        Dice Wurf1 = new Dice(seiten);
        Dice Wurf2 = new Dice(seiten);

        int Ergebnis = Wurf1.wuerfeln() + Wurf2.wuerfeln();

        //System.out.println(Ergebnis);
        return Ergebnis;
    }


}
