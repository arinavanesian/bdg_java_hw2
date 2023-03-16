package main.java.com.example.anonym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class Anonym_inner {
  String name;
  static int count = 0;
  public Anonym_inner(){
    count++;
  }
  public String anun(Anonym_inner anonym){
    name += "!O!";
    return anonym.name;
  }
  //Class.class.getSuperClass()
  // while(className.getSimpleName().equals("Object") !=true ){
     //Bike.eqauls(Object)-->false
    //getsup(className)

  public void getsup(Class objectClass){ //carClass
    // objectClass.getSuperclass(); //Bike.class
    List<Class> list = new ArrayList<>();
    if(!(objectClass.getSimpleName().equals("Object"))){//Bike.class
      list.add(objectClass); //carClass
      getsup(objectClass.getSuperclass());
      // System.out.println(objectClass.getSimpleName() +"\n" +className.getSimpleName());
    }
    Collections.reverse(list);//Bike.class
    for (Class class1 : list) {
      System.out.print(class1.getSimpleName() + "\n");
    }
  }
  
  public static void main(String[] args) {
    // Anonym_inner ai = new Anonym_inner();      
    int[] arr = {9, 2, 4};
    Class carClass = Car.class;
    Class bikeClass = Bike.class;
     new Anonym_inner().getsup(bikeClass);
    // new Anonym_inner().getsup(carClass);
    
    // Class ai = Anonym_inner.class;
    // Car car = new Car();
    // Bike b = new Bike();
    // int[] a1 = {22, 33, 44, 55};
    // int[] a2 = Arrays.copyOf(a1, a1.length + 1);
  
    // for (int i : a2) {
    //   System.out.println(i);
    // }
  }
}
class Car extends Anonym_inner{
  // public Car(){super()}
}

class Bike extends Car{}
