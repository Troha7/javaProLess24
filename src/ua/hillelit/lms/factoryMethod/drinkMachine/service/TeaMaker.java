package ua.hillelit.lms.factoryMethod.drinkMachine.service;

import ua.hillelit.lms.factoryMethod.drinkMachine.api.Drink;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.BleakTea;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.DrinkType;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.GreenTea;

public class TeaMaker extends DrinkMachine {

  @Override
  protected Drink createDrink(DrinkType drinkType) {
    switch (drinkType) {
      case BLEAK_TEA:
        return new BleakTea();
      case GREEN_TEA:
        return new GreenTea();
    }
    return null;
  }
}
