import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {

        int min = 18;
        int max = 40;

        int team1[] = new int[25];
        int team2[] = new int[team1.length];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = ((int) (Math.random() * (max-min))+min);
            team2[i] = ((int) (Math.random() * (max-min))+min);
        }

        System.out.println("Возраст всех игроков 1-й команды = " + Arrays.toString(team1));
        System.out.println("Возраст всех игроков 2-й команды = " + Arrays.toString(team2));
        System.out.println();
        System.out.println("Средний возраст 1-й команды = " + (double)(Arrays.stream(team1).sum())/team1.length);
        System.out.println("Средний возраст 2-й команды = " + (double)(Arrays.stream(team2).sum())/team1.length);

    }
}
