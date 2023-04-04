package org.example;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CoffeeMaker {

    protected int maxCoffee = 2000;
    protected int maxWater = 1500;
    protected int maxMilk = 1000;
    protected int coffee;
    protected int water;
    protected int milk;

    CoffeeMaker() {
        Random random = new Random();
        this.coffee = random.nextInt(maxCoffee);
        this.water = random.nextInt(maxWater);
        this.milk = random.nextInt(maxMilk);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the command: ");
        String command = input.nextLine();
        switcher(command);
    }

    public void switcher(String command) {

        switch(command) {
            case "Hello":
                System.out.println("Hi");
                break;

            case "Status":
                getCoffeeStatus();
                getWaterStatus();
                getMilkStatus();
                break;

            case "Make coffee":
                makeCoffeeGriding();
                makeHeatingWater();
                makePouringWater170ml();
                makePouringWater30ml();
                checkIngredients();
                break;

            case "Make white coffee":
                makeCoffeeGriding();
                makeHeatingWater();
                makePouringWater170ml();
                makePouringWater30ml();
                makePouringMilk50ml();
                checkIngredients();
                break;

            case "Refill coffee":
                setRefillCoffee();
                break;

            case "Refill water":
                setRefillWater();
                break;

            case "Refill milk":
                setRefillMilk();
                break;

            case "Exit":
                System.out.println("Bye");
                break;

            case "q":
                break;
        }
    }

    protected int getCoffeeStatus() {
        int percentCoffee = (int) ((coffee / (double) maxCoffee) * 100);
        return percentCoffee;
    }

    protected int getWaterStatus() {
        int percentWater = (int) ((water / (double) maxWater) * 100);
        return percentWater;
    }

    protected int getMilkStatus() {
        int percentMilk = (int) ((milk / (double) maxMilk) * 100);
        return percentMilk;
    }


    protected void setRefillCoffee() {
        coffee += 500;
        if (coffee > 2000) {coffee = 2000;}
    }
    protected void setRefillWater() {
        water += 500;
        if (water > 1500) {water = 1500;}
    }

    protected void setRefillMilk() {
        milk += 500;
        if (milk > 1000) {milk = 1000;}
    }


    protected void makeCoffeeGriding() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Grinding...");
            waitingTime(1);
        }
        coffee -= 11;
    }

    protected void makeHeatingWater() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Heating water...");
            waitingTime(1);
        }
    }

    protected void makePouringWater170ml() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pouring water...");
            waitingTime(1);
        }
        water -= 170;
    }

    protected void makePouringWater30ml() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pouring water...");
            waitingTime(1);
        }
        water -= 30;
    }

    protected void makePouringMilk50ml() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pouring milk...");
            waitingTime(1);
        }
        milk -= 50;
    }

    protected void checkIngredients() {
        if (coffee < 11) {
            System.out.println("Not enough coffee.");
        }
        if (water < 170) {
            System.out.println("Not enough water.");
        }
        if (milk < 50) {
            System.out.println("Not enough milk.");
        }
    }

    protected void waitingTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
