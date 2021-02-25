package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(controller(generateRandomAge(), -10));
        System.out.println(controller(generateRandomAge(), 6));
        System.out.println(controller(generateRandomAge(), -50));
        System.out.println(controller(generateRandomAge(), -10));
        System.out.println(controller(generateRandomAge(), 0));
    }

    public static String controller(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять.";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять.";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять.";
        } else {
            return "Оставайтесь дома.";
        }
    }

    public static int generateRandomAge() {
        int maxAge = 100;
        Random random = new Random();
        return random.nextInt(maxAge);
    }
}

