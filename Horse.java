package ru.geekbrains.lesson_6;

public class Horse extends Animal {

    private int swimDistance;

    public Horse (String name, String color, int age, int swimDistance){
        super (name, color, age);
        this.swimDistance = swimDistance;
    }

    @Override
    public void jump (float jumpHeight){
        System.out.println(this.name + " can overcome obstacles " + jumpHeight + " meters high.");
    }

    @Override
    public void run (int runDistance){
        System.out.println(this.name + " runs " + runDistance + " meters.");
    }

    public void swim (int swimDistance){
        System.out.println("Horse " + this.name + " can swim" + this.swimDistance + " meters");
    }
}
