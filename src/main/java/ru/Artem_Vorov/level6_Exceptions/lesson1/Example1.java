package ru.Artem_Vorov.level6_Exceptions.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) {
        String data = null;
        if (data == null) {
            throw new ProductNotFoundException("Exception!!! data = null");
        }

    }

    static void m() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
    }
}
