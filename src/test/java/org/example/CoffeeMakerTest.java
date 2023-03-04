package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeMakerTest {
    @Test
    public void getCoffeeStatusShouldReturn5IfCoffeIs100AndFullCapacityIs2000() {
        // Arange
        CoffeeMaker controller = new CoffeeMaker();

        int testCoffee = 100;
        int expectedCoffee = 5;

        // Act
        int result = controller.getCoffeeStatus();

        // Assert
        assertEquals(expectedCoffee, result);

    }

    @Test
    public void WaterTest() {
        // Arange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        int testWater = 150;
        int expectedWater = 10;

        // Act
        int result = coffeeMaker.getWaterStatus();


        // Assert
        assertEquals(expectedWater, result);

    }

    @Test
    public void MilkTest() {
        // Arange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        int testMilk = 100;
        int expectedMilk = 10;

        // Act
        int result = coffeeMaker.getMilkStatus();


        // Assert
        assertEquals(expectedMilk, result);

    }

    @Test
    public void shouldAdd500ToCoffee() {
        // Arange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        int expectedCoffeeAfterAdded = coffeeMaker.coffee + 500;
        // Act
        coffeeMaker.setRefillCoffee();

        // Assert
        assertEquals(expectedCoffeeAfterAdded, coffeeMaker.coffee);
    }

}
