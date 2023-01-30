package сlass4;

import java.util.Random;

import static сlass4.Cat.*;

public class Oper {

    public static void go() {
        int i = 0;
        while (i < 10) {
            System.out.println(name + ", " + age);
            i++;
        }
    }

    public static void rand() {
        Random rnd = new Random();
        int length = rnd.nextInt(7);
        char[] alphabet = new char[length];
        for (int i = 0; i < length; i++) {
            alphabet [i] = (char) rnd.nextInt();}
        for (int i = 0; i < alphabet.length; i++) {
            randomName += alphabet[i];
        }
        Random rand = new Random();
        int[] age = new int[2];
        for (int i = 0; i < age.length; i++) {
            age [i] = rand.nextInt(28) + 1;
        }
    }

    public static void go2() {
        for (int i = 0; i < 10; i++) {
            Cat.setName(randomName);
            Random rand = new Random();
            int randomAge = rand.nextInt(28) + 1;
            Cat.setAge(randomAge);
            System.out.println(getName() + ", " + getAge());
        }
    }

    public static void go3() {
       Cat cat1 = new Cat("Simba", 3);
       Cat cat2 = new Cat("Behemoth", 2);
       Cat cat3 = new Cat ("Hisa", 7);
       Cat cat4 = new Cat ("Garfield", 4);
       Cat cat5 = new Cat ("Vasilyi", 10);

        int i = 0;
        do {
            System.out.println(cat1);
            i++;
        } while (i < 10);

        Cat [] cats = new Cat [] {cat1, cat2, cat3, cat4, cat5};
        for (Cat c : cats) {
            System.out.println(c);
        }
    }
}