package src.main.java.com.lld.SnakeAndLadder.src.main.java;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int rollDice() {
        int start = 1;
        int end = 6;
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }
}
