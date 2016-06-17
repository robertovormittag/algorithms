package net.robertovormittag.idealab.algos.numbers;

public class CoinChange {

    public static StringBuffer RESULT = new StringBuffer();
    public static void reset() {
        RESULT = new StringBuffer();
    }

    public static void greedy(double money) {

        RESULT.append("change for : " + money);

        int dollars = (int) Math.floor(money / 1);
        money -= dollars * 1;

        RESULT.append(" dollars:" + dollars);

        int quarters = (int) Math.floor(money / 0.25);
        money -= quarters * 0.25;

        RESULT.append(" quarters:" + quarters);

        int dimes = (int) Math.floor(money / 0.10);
        money -= dimes * 0.10;

        RESULT.append(" dimes:" + dimes);

        int nickels = (int) Math.floor(money / 0.05);
        money -= nickels * 0.05;

        RESULT.append(" nickles:" + nickels);

        int pennies = (int) Math.round(money * 100);

        RESULT.append(" pennies:" + pennies);

    }
}
