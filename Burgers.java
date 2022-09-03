import java.util.Arrays;

public class Burgers {

    String bun, meat, cheese, greens, mayonnaise;
    int col = 0;



    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Обычный бургер (все компоненты) состоит из: "+ this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens  + ", " + this.mayonnaise);
    }


    public Burgers(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Диетический бургер (без майонеза) состоит из: "+ this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens );

    }


    public Burgers(String bun, String meat, int col) {
        this.bun = bun;
        this.meat = meat;
        this.col = col;
        System.out.println("Double бургер (с двойным мясом) состоит из: "+ this.bun + ", " + this.meat + ", порция мяса х " + this.col );

    }



    public static void main(String[] args) {

       new Burgers("Булочка","говяжья котлета", "сыр Чедер","салат", "соус - майонез");
       new Burgers("Булочка","говяжья котлета", "сыр Чедер","салат");
       new Burgers("Булочка","говяжья котлета",2);

    }
}
