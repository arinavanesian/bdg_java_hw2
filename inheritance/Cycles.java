package main.java.com.example.inheritance;
public class Cycles{

  class Bicycle {
   double avgSpeed = 13.5;
   int wheelsCount = 2;
   String concept;
   int speed;
   int tirePressure = 10;
   void setSpeed(int speed){
      this.speed = speed;
   }
   
   int avgSpeed(int t1, int distance1, int distance2){
     
     int avgV = Math.round(( distance2 - distance1) / t1);
     return avgV;
   }

    void stats(){
     System.out.println("MotoBicycle avgSpeed is:" + avgSpeed + " concept of " + concept
     + " wheelsCount " + wheelsCount);
    }
    void inflateTire(int tirePressure){
      this.tirePressure =  tirePressure;
      if ( tirePressure < 10) {
       System.out.println("Riding on flat tires!"); 
      }
 }  
}

 class MotoBicycle extends Bicycle{
   double avgSpeed; //0.0
   String concept;// null
   int wheelsCount =4;
   MotoBicycle(String concept, double avgSpeed){
    this.avgSpeed = avgSpeed;
    this.concept =concept;
 }
 @Override
 void stats(){
  System.out.println("MotoBicycle avgSpeed is:" + avgSpeed + " concept of " + concept
  + " wheelsCount " + wheelsCount);
 }
 }
 public static void main(String[] args) {
  Cycles cycle = new Cycles();
  MotoBicycle m  = cycle.new MotoBicycle("BMW", 24.2);
  m.stats();
  System.out.println(  m.avgSpeed(5, 100, 159));
  System.out.println(m.wheelsCount = 5);

 }
}

