package main.java.com.example.inheritance;
// import main.java.com.example.inheritance.Address.java;

import java.util.ArrayList;
import java.util.List;

// public   class Test {
//   public Test(){
//     System.out.println("Test");
//   }
//   protected String getNumberOfHumps() {
//     return "Undefined";
//     }
//     public interface Herbivore {
//       public void eatPlants();
//       }
//       public interface Omnivore {
//       public void eatPlants();
//       public void eatMeat();
//       }
//        class Bear implements Herbivore, Omnivore {
//         public void eatMeat() {
//         System.out.println("Eating meat");
//         }
//         public void eatPlants() {
//         System.out.println("Eating plants");
//         }
//         }
// public static void main(String[] args) {
//   Test test = new Test();
//   Bear bear = test.new Bear();
//   bear.eatMeat();
  
  
// }
// }
//   class Car{
//      public void demoMethod(){
//     System.out.println("Hello");
//  }
// }

// class BMW extends Car{
  
//   public  void sound2(){
//     System.out.println("SOUND");
//   }
//   public void sound(){
//     System.out.println("SOUND");
  
//   }
// }
 public abstract class Test {
    void fly() { System.out.println("Bird is flying"); } //private methods can only be HIDDEN

    public static void main(String[] args) {
   Pelican bird = new Pelican();
   bird.fly();
   }
   }
   class Pelican extends Test {
    void fly() { System.out.println("Pelican is flying"); }
   }
   class Car{}
/**
 * InnerTest
 */
 interface InnerTest {
  
}

