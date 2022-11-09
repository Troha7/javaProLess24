package ua.hillelit.lms.factoryMethod.drinkMachine.drinks;

import ua.hillelit.lms.factoryMethod.drinkMachine.api.Drink;

public abstract class Coffee implements Drink {

  public void make() {
    System.out.println("Make: [" + getClass().getSimpleName() + "]");
    System.out.println("- Add Coffee -");
    System.out.println("- Grind Coffee -");
    System.out.println("- Add Water -");
    System.out.println("- Brewing -");
  }

  public void pour() {
    System.out.println("Pour coffee into glass\n");
  }
}
