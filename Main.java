package ru.geekbrains.lesson_6;

public class Main {

    public static void main(String[] args) {

	Dog d = new Dog ("Sharik", "brown", 5, 10 );
	Horse h = new Horse ("Lider", "grey", 7, 100);
	Bird b = new Bird ("Johny", "black", 3);
	Cat c = new Cat ("Morfey", "white", 8);



	d.run(500);
	c.run(200);
	h.run(1500);
	b.run(5);

	d.jump(0.5f);
	c.jump(2);
	h.jump(3);
	b.jump(0.2f);

	d.swim(10);
	h.swim(100);


    }
}
