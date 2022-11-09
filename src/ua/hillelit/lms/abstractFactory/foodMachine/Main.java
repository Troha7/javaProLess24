package ua.hillelit.lms.abstractFactory.foodMachine;

import ua.hillelit.lms.abstractFactory.foodMachine.api.FoodFactory;
import ua.hillelit.lms.abstractFactory.foodMachine.factorys.FactoryProducer;
import ua.hillelit.lms.abstractFactory.foodMachine.food.FoodType;
import ua.hillelit.lms.abstractFactory.foodMachine.food.Products;

public class Main {

  public static void main(String[] args) {
    System.out.println("----ORDER----");

    FoodFactory sandwichFactory = FactoryProducer.getFactory(FoodType.SANDWICH);
    sandwichFactory.getFood(Products.FISH_SANDWICH).order();

    FoodFactory snackFactory = FactoryProducer.getFactory(FoodType.SNACK);
    snackFactory.getFood(Products.CHIPS).order();

    FoodFactory drinkFactory = FactoryProducer.getFactory(FoodType.DRINK);
    drinkFactory.getFood(Products.COFFEE).order();

  }

}
