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

                break;

            case "Make white coffee":

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
    }
    protected void setRefillWater() {
        water += 500;
    }
    protected void setRefillMilk() {
        milk += 500;
    }
}
