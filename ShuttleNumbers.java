public class ShuttleNumbers {
    public static void main(String[] args) {

        int number = 0;
        int ShuttleNum = 0;

        System.out.println("Перечень космических шатлов не содержащие несчастастливые числа в Японии(4,9):");
        while (number < 100) {
            if (!String.valueOf(ShuttleNum).contains("4") && !String.valueOf(ShuttleNum).contains("9")) {
                System.out.println("Шатл номер -  " + ShuttleNum);
                number++;
            }
            ShuttleNum++;
        }
    }
}
