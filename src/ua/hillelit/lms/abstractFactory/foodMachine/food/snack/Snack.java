package ua.hillelit.lms.abstractFactory.foodMachine.food.snack;

import static ua.hillelit.lms.abstractFactory.foodMachine.food.FoodType.SNACK;

import ua.hillelit.lms.abstractFactory.foodMachine.api.Food;

public abstract class Snack implements Food {

  @Override
  public void order() {
    System.out.println("YOUR "+ SNACK +": " + getClass().getSimpleName());
  }
}
