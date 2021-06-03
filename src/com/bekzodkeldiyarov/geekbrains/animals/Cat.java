package com.bekzodkeldiyarov.geekbrains.animals;

public class Cat extends Animal {
    protected static int catCount = 0;

    public Cat() {
//        animalCount++;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int runDistance) {

        if (runDistance <= 200 && runDistance > 0) {
            System.out.println("Кошка пробежала " + runDistance + " метров");
        } else if (runDistance < 0) {
            throw new IllegalArgumentException("Кошка не бежит отрицательное количество метров. Кошка умное животное");
        } else {
            throw new IllegalArgumentException("Кошка может пробежать только 200 метров");
        }
    }

    @Override
    public void swim(int swimDistance) {
        throw new IllegalArgumentException("Кошка к сожелению не умеет плавать, так что вам лучше не вызывать этот метод, чтобы программа не останавилась");
    }
}
