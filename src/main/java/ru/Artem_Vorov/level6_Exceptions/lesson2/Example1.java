package ru.Artem_Vorov.level6_Exceptions.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) {
        String data = null;
        try {
            System.out.println(1);
            //data.toString();
            System.out.println(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catch1");
        } catch (NullPointerException e) {
            System.out.println("Catch2: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Catch3: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println("Ok");

    }
}
