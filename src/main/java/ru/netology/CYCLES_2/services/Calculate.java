package ru.netology.CYCLES_2.services;
public class Calculate {
    public int calculate(int income, int exp, int threshold) {
        int count = 0;
        int money = 0;
//        int threshold = 20_000;
        for (int i = 1; i < 13; i++) {
            if (money >= threshold) {
                System.out.println("месец " + i + " денег " + money + " -Буду отдыхать");
                money = money - exp;
                money = money - (8_000);
                count++;
            } else {
                System.out.println("месец " + i + " Денег " + money + " -Работаем");
                money = money + income;
                money = money - exp;
            }

        }
        return count;
    }
}