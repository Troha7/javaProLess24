package ua.hillelit.lms.abstractFactory.foodMachine.factorys;

import ua.hillelit.lms.abstractFactory.foodMachine.api.FoodFactory;
import ua.hillelit.lms.abstractFactory.foodMachine.food.FoodType;

public class FactoryProducer {

  public static FoodFactory getFactory(FoodType type){
    switch (type){
      case SANDWICH:
        return new SandwichFactory();
      case SNACK:
        return new SnackFactory();
      case DRINK:
        return new DrinkFactory();
      default:
        throw new IllegalArgumentException();
    }

  }

}
