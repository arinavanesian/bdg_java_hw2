package main.java.com.example.enums;

public enum Shapes {
  TRIANGLE, RECTANGLE,PYRAMID;

  public void getAreaTriangle(int width, int height){
    try {
      if(this.equals(TRIANGLE)){
        int area = 0;
         area = (width * height)/2;
       System.out.println("Area oif the triangle: " + area);
      }
      
    } catch (Exception e) {
      // TODO: handle exception
      throw new IllegalAccessError("Can only be used for TRIANGLE");
    }
  }
  public static void main(String[] args) {
     Shapes.RECTANGLE.getAreaTriangle(20, 10);
  }
}

