package main.java.com.example.abstracts;

public class TestAnimals {
  public class Cats extends Animals{
    public void cats(){
      System.out.println("Cats meow");
    };
    public void dogs(){};
  }
  public class Dogs extends Animals{
      public void cats(){};
      public void dogs(){
        System.out.println("Dogs bark");
      }
  }
  public static void main(String[] args) {
    TestAnimals ta = new TestAnimals();
    Cats cats = ta.new Cats();
    Dogs dogs = ta.new Dogs();
    cats.cats();
    dogs.dogs();
  }


}