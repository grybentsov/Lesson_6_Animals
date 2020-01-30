package ru.geekbrains.lesson_6;

public class Cat extends Animal {

    public Cat(String name, String color, int age){
        super (name, color, age);
    }
    @Override
    public void run (int runDistance){
        System.out.println("Cat " + this.name + " can run " + runDistance + " meters.");
    }
    @Override
    public void jump (float jumpHeight){
        System.out.println("Cat " + this.name + " jumps " + jumpHeight + " meters high.");
    }
}
