package com.Sirenko;

public class BankAccount {

    private String name;
    private double count;

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    // 0.5%
    public void add(double count) {
        double bankPercent = count * 0.005;
        Bank.addMoneyToBank(bankPercent);
        this.count += count;

    }

    // 1%
    public void transfer(BankAccount otherPerson, double count) {
        double bankPercent = count * 0.01;
        Bank.addMoneyToBank(bankPercent);
        this.count -= count - bankPercent;
        otherPerson.count += count - bankPercent;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(double count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}


