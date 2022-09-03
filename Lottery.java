import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

//        int min = 0;
//        int max = 9;
        int colNum = 7;


        int arrLottery[] = new int[colNum];
        int arrGamer[] = new int [colNum];

        for (int i = 0; i <arrLottery.length ; i++) {
//            arrLottery[i] = ((int) (Math.random() *(max - min))+min);
            arrLottery[i] = ((int) (Math.random() * 10));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите 7 цифр от 0 до 9");

        for (int i = 0; i < colNum; i++) {
            arrGamer[i] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(arrGamer);
        Arrays.sort(arrLottery);

        System.out.println("Отсортированный перечень цифр загаданные игроком = " + Arrays.toString(arrGamer));
        System.out.println("Отсортированный перечень цифр загаданные компанией = " + Arrays.toString(arrLottery));


        int count = 0;
        for(int i = 0; i < arrLottery.length; i++){
            if(arrGamer[i]==arrLottery[i])
                count++;
        }
        System.out.println("Количество совпадений: "+count);

    }
}
