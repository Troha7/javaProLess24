package ua.hillelit.lms.factoryMethod.drinkMachine;

import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.DrinkType;
import ua.hillelit.lms.factoryMethod.drinkMachine.service.CoffeeMaker;
import ua.hillelit.lms.factoryMethod.drinkMachine.service.DrinkMachine;
import ua.hillelit.lms.factoryMethod.drinkMachine.service.TeaMaker;

public class Main {

  public static void main(String[] args) {

    DrinkMachine coffeeMaker = new CoffeeMaker();
    coffeeMaker.orderDrink(DrinkType.ESPRESSO);
    coffeeMaker.orderDrink(DrinkType.AMERICANO);
    coffeeMaker.orderDrink(DrinkType.LATTE);

    DrinkMachine teaMaker = new TeaMaker();
    teaMaker.orderDrink(DrinkType.BLEAK_TEA);
    teaMaker.orderDrink(DrinkType.GREEN_TEA);

  }

}
