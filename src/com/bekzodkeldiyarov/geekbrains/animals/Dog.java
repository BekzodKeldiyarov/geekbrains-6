package com.bekzodkeldiyarov.geekbrains.animals;

public class Dog extends Animal {
    protected static int dogCount = 0;

    public Dog() {
//        animalCount++;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= 500 && runDistance > 0) {
            System.out.println("Собака пробежала " + runDistance + " метров");
        } else if (runDistance < 0) {
            throw new IllegalArgumentException("Собака не бежит отрицательное количество метров. Собака умное животное");
        } else {
            throw new IllegalArgumentException("Собака может пробежать только 500 метров");
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= 10 && swimDistance > 0) {
            System.out.println("Собака проплыла " + swimDistance + " метров");
        } else if (swimDistance < 0) {
            throw new IllegalArgumentException("Собака не плывет отрицательное количество метров. Собака умное животное");
        } else {
            throw new IllegalArgumentException("Собака сможет проплыть только 10 метров.");
        }
    }
}
