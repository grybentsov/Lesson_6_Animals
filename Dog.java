package ru.geekbrains.lesson_6;

public class Dog extends Horse {

    public Dog(String name, String color, int age, int swimDistance){
        super (name, color, age, swimDistance);

    }

    @Override
    public void jump (float jumpHeight){
        System.out.println("Our " + this.name + " can jump " + jumpHeight + " meters high.");
    }

    @Override
    public void run (int runDistance){
        System.out.println(this.name + " runs " + runDistance + " meters.");
    }

    @Override
    public void swim (int swimDistance){
        System.out.println(this.name + " swims" + swimDistance + " meters");
    }
}
