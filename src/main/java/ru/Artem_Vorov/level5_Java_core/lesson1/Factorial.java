package ru.Artem_Vorov.level5_Java_core.lesson1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(100));
        System.out.println(factorial(120));
        System.out.println(factorial(90));
        System.out.println(factorial(12));
    }

//    static int factorial(int n) {
//        int res = 1;
//        for (int i = 1; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }

//    static int factorial(int n) {
//        if (n == 1) return 1;
//        return n * factorial(n - 1);
//    }

//    static BigInteger factorial(int n) {
//        if (n == 1) return BigInteger.ONE;
//        return BigInteger.valueOf(n).multiply(factorial(n - 1));
//    }

    static Map<Integer, BigInteger> mapCache = new HashMap<>();
    static BigInteger factorial(int n) {
        BigInteger result;

        if (n == 1) return BigInteger.ONE;
        if ((result = mapCache.get(n)) != null) return result;
        result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        mapCache.put(n, result);
        return result;
    }
}
