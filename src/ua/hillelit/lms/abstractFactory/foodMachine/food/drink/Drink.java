package ua.hillelit.lms.abstractFactory.foodMachine.food.drink;

import static ua.hillelit.lms.abstractFactory.foodMachine.food.FoodType.DRINK;

import ua.hillelit.lms.abstractFactory.foodMachine.api.Food;


public abstract class Drink implements Food {

  @Override
  public void order() {
    System.out.println("YOUR "+ DRINK +": " + getClass().getSimpleName());
  }
}
