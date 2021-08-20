package com.company;

public class Main {

    public static void main(String[] args) {
	    AnimalQueue animals = new AnimalQueue();
	    animals.enqueue(new Cat("kiki"));
        animals.enqueue(new Cat("kiko"));
        animals.enqueue(new Dog("biki"));
        animals.enqueue(new Cat("reki"));
        animals.enqueue(new Dog("koko"));

        System.out.println(animals.dequeueDogs().name);
    }
}
