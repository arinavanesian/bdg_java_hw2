package main.java.com.example.enums;

import java.util.Scanner;

class EnumExample2{ 
  
  enum Coffesize{   
  SMALL(5), MIDIUM(10), LARGE(15);
  private int value;  
  private Coffesize(int value){  
    this.value=value;  
  }  
}
  public void select(){  
    Coffesize coffee;
    
    Scanner sc = new Scanner(System.in);
    String size = sc.next();
    if (size.equals(Coffesize.valueOf(size))) {
      System.out.println(coffee+" "+coffee.value + "$");  
      
    }
  }
      public static void main(String[] args) {
      }
    
    

  }  