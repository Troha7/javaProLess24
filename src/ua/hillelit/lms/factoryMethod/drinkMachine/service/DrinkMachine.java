package ua.hillelit.lms.factoryMethod.drinkMachine.service;

import ua.hillelit.lms.factoryMethod.drinkMachine.api.Drink;
import ua.hillelit.lms.factoryMethod.drinkMachine.drinks.DrinkType;

public abstract class DrinkMachine {

  protected abstract Drink createDrink(DrinkType drinkType);

  public void orderDrink(DrinkType drinkType) {
    Drink drink = createDrink(drinkType);

    drink.make();
    drink.pour();
  }

}
