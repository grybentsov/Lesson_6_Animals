package ru.geekbrains.lesson_6;

public class Bird extends Animal {

    public Bird (String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void jump (float jumpHeight) {
        System.out.println("Bird called " + this.name + " can jump " + jumpHeight + " meters high.");
    }

    @Override
    public void run (int runDistance){
        System.out.println(this.name + " runs" + " no more than " + runDistance + " meters.");
    }
}
