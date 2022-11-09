package ua.hillelit.lms.abstractFactory.foodMachine.factorys;

import ua.hillelit.lms.abstractFactory.foodMachine.api.Food;
import ua.hillelit.lms.abstractFactory.foodMachine.api.FoodFactory;
import ua.hillelit.lms.abstractFactory.foodMachine.food.Products;
import ua.hillelit.lms.abstractFactory.foodMachine.food.drink.Coffee;
import ua.hillelit.lms.abstractFactory.foodMachine.food.drink.Tea;

public class DrinkFactory implements FoodFactory {

  @Override
  public Food getFood(Products product) {
    switch (product){
      case COFFEE:
        return new Coffee();
      case TEA:
        return new Tea();
    }
    return null;
  }
}
