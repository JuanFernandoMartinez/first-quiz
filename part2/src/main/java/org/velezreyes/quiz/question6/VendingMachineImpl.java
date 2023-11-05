package org.velezreyes.quiz.question6;

import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine {


  private final static HashMap<String, Double> prices = new HashMap<>();
  private static  VendingMachine instance;



  private double money;

  private VendingMachineImpl(){
      this.money = 0;
      prices.put("ScottCola", 0.75);
      prices.put("KarenTea", 1.0);
  }

  public static VendingMachine getInstance() {
    // Fix me!
    if (instance == null){
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {
      money += 0.25;
  }


  private Drink createDrink(String name){
    return new Drink() {
      @Override
      public String getName() {
        return name;
      }

      @Override
      public boolean isFizzy() {
        return name.contains("Cola");
      }
    };
  }
  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (prices.containsKey(name)){
      if (money >= prices.get(name)){
        money-= prices.get(name);
        return createDrink(name);
      }else{
        throw new NotEnoughMoneyException();
      }
    }else {
      throw new UnknownDrinkException();
    }
  }
}
