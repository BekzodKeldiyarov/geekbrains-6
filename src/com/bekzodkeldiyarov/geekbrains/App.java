package com.bekzodkeldiyarov.geekbrains;

import com.bekzodkeldiyarov.geekbrains.animals.Animal;
import com.bekzodkeldiyarov.geekbrains.animals.Cat;
import com.bekzodkeldiyarov.geekbrains.animals.Dog;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

        Cat cat = new Cat();
        cat.run(150);
//        cat.swim(112);

        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());
        System.out.println(Animal.getAnimalCount());
    }
}
