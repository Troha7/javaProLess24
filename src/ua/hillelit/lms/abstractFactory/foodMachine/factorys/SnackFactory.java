package ua.hillelit.lms.abstractFactory.foodMachine.factorys;

import ua.hillelit.lms.abstractFactory.foodMachine.api.Food;
import ua.hillelit.lms.abstractFactory.foodMachine.api.FoodFactory;
import ua.hillelit.lms.abstractFactory.foodMachine.food.Products;
import ua.hillelit.lms.abstractFactory.foodMachine.food.snack.Chips;
import ua.hillelit.lms.abstractFactory.foodMachine.food.snack.Chocolate;

public class SnackFactory implements FoodFactory {

  @Override
  public Food getFood(Products product) {
    switch (product){
      case CHIPS:
        return new Chips();
      case CHOCOLATE:
        return new Chocolate();
    }
    return null;
  }
}
