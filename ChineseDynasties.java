public class ChineseDynasties {
    public static void main(String[] args) {
       //Ли
        int soldier1 = 13;
        int archer1 = 24;
        int rider1 = 46;
        int col_wariors1 = 860;

        //Минь
        int soldier2 = 9;
        int archer2 = 35;
        int rider2 = 12;
        double col_wariors2 =col_wariors1 * 1.5;
        
        int wariors1 = (soldier1 + archer1 + rider1) * col_wariors1;
        double wariors2 = Math.ceil((soldier2 + archer2 + rider2) * col_wariors2);

        System.out.println("Суммарное значение общей атаки для армии Ли = " + wariors1);
        System.out.println("Суммарное значение общей атаки для армии Минь = " + (int) wariors2);

    }
}
