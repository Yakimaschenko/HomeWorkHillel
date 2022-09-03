package Lesson11.HomeWor17;

import Lesson11.HomeWor17.Androids;
import Lesson11.HomeWor17.iPhones;

public class MainApp {

    public static void main(String[] args) {
        Androids androids = new Androids();
        iPhones iPhones = new iPhones();


        System.out.println("Androids: " + androids.toString());
        System.out.println("iPhones: " + iPhones.toString());

    }
}
