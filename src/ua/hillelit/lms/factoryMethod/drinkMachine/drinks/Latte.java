package ua.hillelit.lms.factoryMethod.drinkMachine.drinks;

public class Latte extends Coffee {

  @Override
  public void make() {
    super.make();
    System.out.println("- Add Milk -");
  }

  @Override
  public void pour() {
    super.pour();
  }
}
