package main.java.com.example.inheritance;


public class Parent{

class Par{
  public Par(){
      System.out.println("Super(Parent constructor) called."); //3
    }
    static{
      System.out.println("Static block."); //1
      
    }
    {
      System.out.println("Instance block."); //2
    }
     void printHello(){
       System.out.println("Hello Parent class");
      }
    }
    
    
    class Child extends Par{ 
      // Child(){
        //   super();
      // }
      //  works by default
      void printHello(){
        super.printHello();
        System.out.println("Hello Child class"); 
      }
      }

         public static void main(String[] args) {
           
           Parent parent = new Parent();
           Child child = parent.new Child();
           child.printHello();    
          //  Afer creating parent object
           //1 Static block
          //2 Instance block
          // Super constructor gets called 
      
          // After calling child object
          // 1 Parent's instance block is called
          // 2 Parents constructor is called
          
          // By calling child's method with super's method inside 
          //1 Parent's method is executed
          //2 Child's method is executed
          
         }
      }