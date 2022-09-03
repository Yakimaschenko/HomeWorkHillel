public class Tax {
    public static void main(String[] args) {


        int amountconst = 100;                   // сумма константа
        int amountTax = 101;                   // сумма доходов
        double  tax = 0.2;                         // 20% налоговая ставка
        double amountIncome = (amountTax - amountconst) * tax;



        if (amountTax <= 100) {
            System.out.println("Сумма меньше 100 не облагается налогом");
        } else {
            System.out.println("Сумма налога: " +  amountIncome); // сумма налога
        }

    }
}
