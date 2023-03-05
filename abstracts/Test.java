package main.java.com.example.abstracts;

import main.java.com.example.abstracts.Marks.*;

public class Test {
  class A extends Marks{
    int sum;
    @Override
    public int getPercentage(int[] a) {
      for (int i : a) {
         this.sum +=i; 
      }
      sum /=a.length;
      return sum;
    }
  }
  public static void main(String[] args) {
    
  }
}
