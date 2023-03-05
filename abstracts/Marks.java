package main.java.com.example.abstracts;

  public abstract class Marks{
    public Marks(){System.out.println("Marks constructor");}
    public abstract int getPercentage(); 
    public static void main(String[] args) {
     Marks a = new A(30, 30, 60) ;
     Marks b = new B(30, 30, 60, 100) ;
     System.out.println(a.getPercentage());
     System.out.println(b.getPercentage());
     
    }
  }

  class A extends Marks{
    int subject1, subject2, subject3, subject4;
    public A(int subject1, int subject2, int subject3){
      if (subject1 >= 0 &&subject1 <= 100) {
        this.subject1 = subject1;
        
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }
      if (subject2 >= 0 &&subject2 <= 100) {
        this.subject2 = subject2;
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }

      if (subject3 >= 0 &&subject3 <= 100) {
        this.subject3 = subject3;
        
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }
    }
    public int getPercentage(){
      int avgPercent = (this.subject1 + this.subject2 + this.subject3)/ 3;
return avgPercent;
    }
  }
  class B extends Marks{
    int subject1, subject2, subject3, subject4;
    public B(int subject1, int subject2, int subject3, int subject4){
      if (subject1 >= 0 &&subject1 <= 100) {
        this.subject1 = subject1;
        
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }
      if (subject2 >= 0 &&subject2 <= 100) {
        this.subject2 = subject2;
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }

      if (subject3 >= 0 &&subject3 <= 100) {
        this.subject3 = subject3;
        
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }
      if (subject4 >= 0 &&subject4 <= 100) {
        this.subject4 = subject4;
        
      } else {
        throw new IllegalArgumentException("Marks for subject 2 must be between 0 and 100.");
      }
    }
    public int getPercentage(){
      int avgPercent = (this.subject1 + this.subject2 + this.subject3)/ 3;
      return avgPercent;
    }
  }
