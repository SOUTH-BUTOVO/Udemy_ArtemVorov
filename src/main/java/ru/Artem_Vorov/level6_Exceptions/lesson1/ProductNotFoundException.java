package ru.Artem_Vorov.level6_Exceptions.lesson1;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
