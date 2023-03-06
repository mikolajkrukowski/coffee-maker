package org.example;

import java.util.Random;

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

    public void switcher(String command) throws InterruptedException {

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
                break;

            case "Make white coffee":
                makeCoffeeGriding();
                makeHeatingWater();
                makePouringWater170ml();
                makePouringWater30ml();
                makePouringMilk50ml();
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
                System.out.println("Break");
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


    protected void makeCoffeeGriding() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Grinding...");
            Thread.sleep(1000);
        }
        coffee -= 11;
    }

    protected void makeHeatingWater() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.println("Heating water...");
            Thread.sleep(1000);
        }
    }

    protected void makePouringWater170ml() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pouring water...");
            Thread.sleep(1000);
        }
        water -= 170;
    }

    protected void makePouringWater30ml() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pouring water...");
            Thread.sleep(1000);
        }
        water -= 30;
    }

    protected void makePouringMilk50ml() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pouring milk...");
            Thread.sleep(1000);
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



}
