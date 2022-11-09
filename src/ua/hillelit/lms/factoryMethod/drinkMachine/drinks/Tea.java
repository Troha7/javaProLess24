package ua.hillelit.lms.factoryMethod.drinkMachine.drinks;

import ua.hillelit.lms.factoryMethod.drinkMachine.api.Drink;

public abstract class Tea implements Drink {

  @Override
  public void make() {
    System.out.println("Make: [" + getClass().getSimpleName() + "]");
    System.out.println("- Add " + getClass().getSimpleName() + " -");
    System.out.println("- Add Water -");
    System.out.println("- Brewing -");
  }

  @Override
  public void pour() {
    System.out.println("Pour tea into glass\n");
  }
}
