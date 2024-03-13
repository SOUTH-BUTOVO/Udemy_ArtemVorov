package ru.Artem_Vorov.level3.lesson7.HW;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private String childName;
//    private ArrayList<Human> human;

    public Human() {
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
//        human = new ArrayList<Human>();
    }

    public Human(String name, boolean gender, int age, String child) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.childName = child;
//        human = new ArrayList<Human>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean isGender() {
//        return gender;
//    }

//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void setChild(String child) {
        this.childName = child;
    }


//    public ArrayList<Human> getHuman() {
//        return human;
//    }

//    public void setHuman(Human human) {
        //this.human = human;
//    }

    @Override
    public String toString() {
        String gender;
        if (this.gender) {
            gender = "Мужской";
        } else gender = "Женский";
        if (!(childName == null)) {
            childName = "Ребёнок: " + gender + childName + "!";
            return ("Моё имя " + name + ", пол " + gender + ", возраст " + age + " " + childName);
        }
        return ("Моё имя " + name + ", пол " + gender + ", возраст " + age);
    }
}
