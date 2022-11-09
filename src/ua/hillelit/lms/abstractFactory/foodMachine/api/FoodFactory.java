package ua.hillelit.lms.abstractFactory.foodMachine.api;

import ua.hillelit.lms.abstractFactory.foodMachine.food.Products;

public interface FoodFactory {

  Food getFood(Products product);

}
