package main.java.com.example.enums;

public enum Unit {
  METER(100){
    public Unit getBaseUnit(){
      return this;
    }
  }, KILOGRAM(100){
    public Unit getBaseUnit(){
      return this;
    }
    
  },
  GRAM(100){
    public Unit getBaseUnit(Unit unit){
      return KILOGRAM.compareTo(GRAM) /;
    }

  },SECOND(100){
    public Unit getBaseUnit(){
      return this;
    }
    
  }, AMPERE(100){
    public Unit getBaseUnit(){
      return this;
    }
    
  }, KELVIN{
    public Unit getBaseUnit(){
      return this;
    }
  }, MOLE(100){  
    public Unit getBaseUnit(){
      return this;
    }
  },
  CANDELA(100){
  public Unit getBaseUnit(){
    return this;
  }

};
public int amount;
private Unit(int amount){this.amount = amount;}
public int getAmount(){
  return this.amount;
}
public abstract Unit getBaseUnit();
}
