package ua.hillelit.lms.factoryMethod.drinkMachine.service;

import ua.hillelit.lms.factoryMethod.drinkMachine.api.Drink;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.Americano;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.DrinkType;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.Espresso;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.Latte;

public class CoffeeMaker extends DrinkMachine {

  @Override
  protected Drink createDrink(DrinkType drinkType) {
    switch (drinkType) {
      case ESPRESSO:
        return new Espresso();
      case AMERICANO:
        return new Americano();
      case LATTE:
        return new Latte();
    }
    return null;
  }
}
