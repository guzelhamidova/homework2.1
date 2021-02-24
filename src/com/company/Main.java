package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(controller(25, -10));
        System.out.println(controller(79, 6));
        System.out.println(controller(25, -50));
        System.out.println(controller(28, -10));
        System.out.println(controller(23, 0));
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
}

