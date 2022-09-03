import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int maxAttempt = 3;
        int attempt = 0;

        System.out.println("Угадайте число от 0 до 10 с 3-х попыток.");
        System.out.println("Для выхода из программы введите - 500.");

        Random random = new Random();
        int number = random.nextInt(10);
//        System.out.println("number = " + number);

        //получаем ввод от пользователя
        Scanner in = new Scanner(System.in);
        while (attempt<maxAttempt){
            attempt++;
            System.out.println("Попытка № " + attempt);
            int value = in.nextInt();

            if (value == 500){
                break;
            }
            if (value > number){
                System.out.println("Загаданное число меньше. Введите, число меньше. Осталось " + (maxAttempt - attempt)+ " попытка(тки)");
            }else if (value < number){
                System.out.println("Загаданное число больше. Введите, число больше. Осталось " + (maxAttempt - attempt)+ " попытка(тки)");
            } if (value != number) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
            }
        System.out.println("Конец игры!");

        }
    }

