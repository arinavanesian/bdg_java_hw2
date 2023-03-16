package main.java.com.example.enums;

import java.util.Scanner;

//create enums
// include abstract changeState
// implement the abstract method as to print the lights as time goes by 
//set a myTimer(changeState, 3000)
// if doing it with ordinals 0 1 2 

//switch case solution
//TrafficLight light=  TrafficLight.X
//X changes depending on myTimer.schedule(changeState, 3000)

// Timer t = new Timer()
// TimerTask change = new TimerTask(){
//  @Override
//   public void run(){
//     System.out.println(traffic.);
// }
// };

// TrafficLight changeState(){
//LOOP while(true){
  // if(i = enum.length){i = 0 continue LOOP}
  // int i = 0
  // sout(traffic.ordinal(i))
  // i++
// }
// 
// }
// }

// 1create an enum
// 2.changeState()-create a method for printing enum values

// 3.create a timer for calling the changeState method every 3s
// 4.create an infinite while loop so it provids the next value in the enum
// 5.timer.schedule(changeState(), 3000)
// changeState(){ 
// TrafficLight.ordinal(ixx)
// }
// a loop where if the valuable 
public class Enums {
  public Enums(TrafficLight traffic){}
  enum TrafficLight{RED, GREEN, LIGHT};
// 


public static void main(String[] args) {
  System.out.println( TrafficLight().ordinal(1));
}


}
  //   enum Seasons{WINTER(10), SUMMER(20), SPRING(30), FALL(40);
    //     private int value;
    //     private Seasons(int value){
      //       this.value = value;
      //     }
      //     public static void main(String[] args) {
// ;
//       for (Seasons s : Seasons.values()) {
//         System.out.println(s.value);
//       }
//       System.out.println(Seasons.valueOf("WINTER").ordinal());
//     } 
//   }
// }
