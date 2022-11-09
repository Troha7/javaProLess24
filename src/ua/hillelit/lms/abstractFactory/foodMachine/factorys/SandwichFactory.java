package ua.hillelit.lms.abstractFactory.foodMachine.factorys;

import ua.hillelit.lms.abstractFactory.foodMachine.api.Food;
import ua.hillelit.lms.abstractFactory.foodMachine.api.FoodFactory;
import ua.hillelit.lms.abstractFactory.foodMachine.food.sandwich.FishSandwich;
import ua.hillelit.lms.abstractFactory.foodMachine.food.sandwich.MeatSandwich;
import ua.hillelit.lms.abstractFactory.foodMachine.food.Products;

public class SandwichFactory implements FoodFactory {

  @Override
  public Food getFood(Products product) {
    switch (product){
      case FISH_SANDWICH:
        return new FishSandwich();
      case MEAT_SANDWICH:
        return new MeatSandwich();
    }
    return null;
  }

}
