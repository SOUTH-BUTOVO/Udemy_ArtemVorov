package ru.Artem_Vorov.level5_Java_core.lesson3;

public enum Role {
    ADMIN("I`m admin"),
    USER("I`m user");

    Role(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
