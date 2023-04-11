package ru.netology.services;

import ru.netology.CYCLES_2.services.Calculate;

public class Main {

    public static void main(String[] args) {
        int count;
        Calculate calc = new Calculate();
        count = calc.calculate(10000, 3000, 20_000);
        System.out.println("Мы отдыхали " + count + " раз");

        System.out.println("====================");

        count = calc.calculate(100_000, 60_000, 150_000);
        System.out.println("Мы отдыхали " + count + " раз");
    }
}
