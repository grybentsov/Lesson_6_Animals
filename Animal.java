package ru.geekbrains.lesson_6;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run (int runDistance){
        System.out.println(name + " can run " + runDistance + " meters.");
    }

    public void jump (float jumpHeight){
        System.out.println(name + " can jump " + jumpHeight + " meters high.");
    }
}
