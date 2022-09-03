import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите название 1-й команды:");
        String  team1 = scanner1.next();
        System.out.println("Введите количество фрагов для 1-го игрока:");
        int gamer1 = scanner1.nextInt();
        System.out.println("Введите количество фрагов для 2-го игрока:");
        int gamer2 = scanner1.nextInt();
        System.out.println("Введите количество фрагов для 3-го игрока:");
        int gamer3 = scanner1.nextInt();
        System.out.println("Введите количество фрагов для 4-го игрока:");
        int gamer4 = scanner1.nextInt();
        System.out.println("Введите количество фрагов для 5-го игрока:");
        int gamer5 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите название 2-й команды:");
        String  team2 = scanner2.next();
        System.out.println("Введите количество фрагов для 1-го игрока:");
        int player1 = scanner2.nextInt();
        System.out.println("Введите количество фрагов для 2-го игрока:");
        int player2 = scanner2.nextInt();
        System.out.println("Введите количество фрагов для 3-го игрока:");
        int player3 = scanner2.nextInt();
        System.out.println("Введите количество фрагов для 4-го игрока:");
        int player4 = scanner2.nextInt();
        System.out.println("Введите количество фрагов для 5-го игрока:");
        int player5 = scanner2.nextInt();

        System.out.println("--------------------------------------------");

        double result1 = (gamer1 + gamer2 + gamer3 + gamer4 + gamer5 ) / 5;
        double result2 = (player1 + player2 + player3 + player4 + player5) / 5;
        if (result1>result2){
            System.out.println("Победила команда " + team1 + " набравшая " + result1 + " очков");
        }else{
            System.out.println("Победила команда " + team2 + " набравшая " + result2 + " очков");
        }


    }
}
