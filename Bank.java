package com.Sirenko;

public class Bank {

    private static double count;

    public static void addMoneyToBank(double count) {
        Bank.count += count;
    }

    public static double getMoney() {
        return count;
    }
}
