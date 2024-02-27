package ru.Artem_Vorov.level3.lesson5;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

//        Date today = new Date();
//        System.out.println("Current date: " + today.getTime());
//
//        int msDay = 24 * 60 * 60 * 1000;
//        System.out.println("Years from 1970: " + today.getTime() / msDay / 365);
//        System.out.println(msDay);

        Date currentTime = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms.");
    }
}
