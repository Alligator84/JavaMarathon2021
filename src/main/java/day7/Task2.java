package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Player player1 = new Player(rnd.nextInt(10) + 90);
        Player player2 = new Player(rnd.nextInt(10) + 90);
        Player player3 = new Player(rnd.nextInt(10) + 90);
        Player player4 = new Player(rnd.nextInt(10) + 90);
        Player player5 = new Player(rnd.nextInt(10) + 90);
        Player.info();
        Player player6 = new Player(1);
        Player.info();
        Player player7 = new Player(rnd.nextInt(10) + 90);
        Player.info();
        System.out.println(player6.getStamina());
        player6.run();
        System.out.println(player6.getStamina());
        Player.info();
    }
}
