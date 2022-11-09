package ua.hillelit.lms.abstractFactory.foodMachine.food.sandwich;

import static ua.hillelit.lms.abstractFactory.foodMachine.food.FoodType.SANDWICH;

import ua.hillelit.lms.abstractFactory.foodMachine.api.Food;

public abstract class Sandwich implements Food {

  @Override
  public void order() {
    System.out.println("YOUR "+ SANDWICH +": " + getClass().getSimpleName());
  }
}
