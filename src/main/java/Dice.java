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

}
