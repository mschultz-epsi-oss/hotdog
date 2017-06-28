package main;

import hotdogpackage.*;

public class Main {

    public static void main(String[] args) {
        HotDog hd = new HotDogBase("HotDogBase", "hot dog de base");
        hd = new MoutardeCidre(hd);
        hd = new MoutardeDijon(hd);
        hd.fabriqueToi();

        System.out.println("--");

        HotDog hd2 = new HotDogMeuh("HotDogMeuh", "hot dog meuh");
        hd2 = new MoutardeDijon(hd2);
        hd2 = new MoutardeCidre(hd2);
        hd2.fabriqueToi();

        System.out.println("--");

        HotDog hd3 = new HotDogMeuh("HotDogMeuh", "hot dog meuh");
        hd3.fabriqueToi();

        System.out.println("--");

        HotDog hd4 = new HotDogBase("HotDogBase", "hot dog de base");
        hd4.fabriqueToi();
    }
}
