package main.java.com.example.inheritance;

import java.util.Scanner;

public class Car {

  class InnerCar {
    String engineType; 
    // char engineType;

    {
      System.out.println("InnerCar");
    }
    int passengerCount = 4;
    // static
    //   String engineType = new Scanner(System.in).next();
    // void  setEngyneType(String engineType){
    //   // if (Character.isAlphabetic(engineType)){
    //   //   this.engineType = engineType;
    //   // }
    //   try {
    //   if(engineType == "[^a-zA-Z]"){
    //     this.engineType = engineType;

    //   }  
    //   } catch (Exception e) {
    //     // TODO: handle exception
    //     System.out.println("Engine Type should be an alphabet!");
    //   }
      
    
    int getPassengerCount(){
      return this.passengerCount;
    }
    void setPassengerCount(int passengerCount){
      this.passengerCount = passengerCount;
     
    }
  }  
  
  class Truck  extends InnerCar{
    
    {
      System.out.println("Truck");
    }
    int capacity = 0;
    int getCapacity(){
      return this.capacity;
}
void setCapacity(int capacity){
  this.capacity = capacity;
}
}
public static void main(String[] args) {
  Car car = new Car();
  InnerCar incar = car.new InnerCar();
  Truck truck = car.new Truck();
  
}

}