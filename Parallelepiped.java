public class Parallelepiped {
    public static void main(String[] args) {

        int side1 = 10;
        int side2 = 3;
        int side3 = 4;

        int volume = side1 * side2 * side3;
        int length = (side1 + side2 + side3) * 4;

        System.out.println("Объем параллелепипеда = " + volume);
        System.out.println("Суммарная длина всех сторон параллелепипеда = " + length);

    }
}
