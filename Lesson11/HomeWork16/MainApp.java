package Lesson11.HomeWork16;

import java.util.Arrays;
import java.util.Scanner;

enum DrinksMachine{
    COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA;


}

public class MainApp {

   static class Drinks{
       public static final int COFFEE_PRICE = 50;
       public static final int TEA_PRICE = 45;
       public static final int LEMONADE_PRICE = 70;
       public static final int MOJITO_PRICE = 85;
       public static final int MINERAL_WATER_PRICE = 15;
       public static final int COCA_COLA_PRICE = 55;


       Scanner colDrink = new Scanner(System.in);

       public int coffeePrepare(){
           System.out.println("Чашка кофе стоит: " + COFFEE_PRICE + "грн");
           System.out.print("Введите количество чашек кофе: ");
           return colDrink.nextInt();
       }
       public int teaPrepare(){
           System.out.println("Чашка чая стоит: " + TEA_PRICE + "грн");
           System.out.print("Введите количество чашек чая: ");
           return colDrink.nextInt();
       }
       public int lemonadePrepare(){
           System.out.println("Стоимость Лемонада: " + LEMONADE_PRICE + "грн");
           System.out.print("Введите количество : ");
           return colDrink.nextInt();
       }
       public int mojitoPrepare(){
           System.out.println("Стоимость Мохито: " + MOJITO_PRICE + "грн");
           System.out.print("Введите количество чашек чая: ");
           return colDrink.nextInt();
       }
       public int mineralWaterPrepare(){
           System.out.println("Чашка чая стоит: " + MINERAL_WATER_PRICE + "грн");
           System.out.print("Введите количество чашек чая: ");
           return colDrink.nextInt();
       }
       public int cocaColaPrepare(){
           System.out.println("Стоимость Coca-cola: " + COCA_COLA_PRICE + "грн");
           System.out.print("Введите количество чашек чая: ");
           return colDrink.nextInt();
       }


   }
//       DrinksMachine drinksMachine;
//       int coast;

//    public DrinksMachine getDrinksMachine() {
//        return drinksMachine;
//    }

//    public int getCoast() {
//        return coast;
//    }

//    public MainApp(DrinksMachine drinksMachine, int coast) {
//        this.drinksMachine = drinksMachine;
//        this.coast = coast;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();
        boolean a = true;//условие для цикла
        while (a) {
            System.out.println("Выберите напиток: ");
            System.out.println(Arrays.toString(DrinksMachine.values()));//список напитков
            String choice = scanner.nextLine();
            choice = choice.toUpperCase();
            DrinksMachine drinksAuto = DrinksMachine.valueOf(choice);//выбор напитка
            switch (drinksAuto) {
                case COFFEE:
                    drinks.coffeePrepare();
                    break;
                case TEA:
                    drinks.teaPrepare();
                    break;
                case LEMONADE:
                    drinks.lemonadePrepare();
                    break;
                case MOJITO:
                    drinks.mojitoPrepare();
                    break;
                case MINERAL_WATER:
                    drinks.mineralWaterPrepare();
                    break;
                case COCA_COLA:
                    drinks.cocaColaPrepare();
                    break;

                default:
                    System.out.println("К сожалению такого напитка нет в перечне, выбирете напиток из списка:");
            }
            System.out.println("Желаете чего-нибудь еще? ДА/НЕТ");

            boolean moreDrinks = true;//условие для цикла
            while (moreDrinks) {

                String answer = scanner.nextLine();
                if (answer.equals("НЕТ") || answer.equals("Нет") || answer.equals("нет")) {
                    moreDrinks = false;
                    a = false;
                    System.out.println("Ваш счет составил = " );
                } else if (answer.equals("Да") || answer.equals("ДА") || answer.equals("да")) {
                    moreDrinks = false;
                } else {
                    System.out.println("Ответьте - ДА/НЕТ");
                }
            }

//            System.out.println("***************************************");
//            int totalPrice = 0;
//            for (Drinks drink : result()) {
//                System.out.println(drink + "(" + result.get(drink) + ") -> " + result.get(drink)*drink.getPrice());
//                totalPrice+=result.get(drink)*drink.getPrice();
//            }
//            System.out.println("TOTAL PRICE : " + totalPrice);
//        }


                    }
    }

}
