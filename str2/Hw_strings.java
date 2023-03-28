package main.java.com.example.str2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hw_strings {
  
  private int i;
  StringBuilder stringInclude(String s) {
    StringBuilder sb = new StringBuilder(s);
    if (sb.charAt(0) == 'o') {
      sb.append(sb.charAt(0));
    } else if (sb.charAt(1) == 'z') {
      sb.append(s.charAt(1));
    } else {
      sb.append(s.substring(2));
    }
    return sb;
  }

  // Q2
  // count "xx"
  int xxCount(String s) { //xxx
    int count = 0;
    String[] sA = s.split(""); //[x, x, x]
    if (s.contains("xx")) {
      for (int i = 0; i < sA.length - 1; i++) {
        if ((sA[i] + sA[i + 1]).equals("xx")) {
          count++;
        }
      }
    }

    // return s.split("xx").length;
    return count;
  }
  // Q3
  // include in the array-->  reverse it, join it and compare
  // reverse for loop, store and compare with the input
   boolean palindrome(String s){
    boolean isPalindrome=false;
    StringBuilder sb = new StringBuilder(s);
    if ((sb.reverse().toString()).equals(s)) {
      isPalindrome = true;   
    }
    return isPalindrome;
  }
  
  // to.String().split("").reverse().join() == input
  
  // Q4
  // input and output are lists(or arrays)
  // check .startsWith --> store in an output array 
  //  return by foreach iteration through the array
   String startsWith_a(ArrayList<String> arrayList){
    for (String string : arrayList) {
    if(!string.startsWith("a") && string.length()!=3);    {
      arrayList.remove(string); 
      }
    }
    return arrayList.toString();
    }
   
  // Q5

  // Q7
  //  iterate through the string.split(" ")
  // call the palindrome method
  // INCLUDE palindromeLongest and compare while defining
  // like min and max values
  // take returned palindrome length and compare in an ifstatement
  // have an initial len variable 
  //OR store the palindromes in an array

  // Q8
  // use one for loop
  // if the substrings match--> compare--> if match--> store the length
  // on the next iteration compare length
String compareSub(String s1, String s2){
  String arrS[] = new String[s1.length()];
  String arrS2[] = new String[ s2.length()];
  String longesSub= "";
  // StringBuilder sb= new StringBuilder();
  // int count = 0;
  // int longestLen= 0;
  for (int i = 0; i < arrS.length; i++) {
    for (int j = 0; j < arrS2.length; j++) {
      if(arrS[i].equals(arrS2[j]) && arrS[i].length() > arrS2[j].length()){
        // sb.append(arrS[i]);
        longesSub +=arrS[i];
        // count++;
      }
    }
  }
  // String arrS2[] = new String[count];
  // for (int i = 0; i < arrS.length-1; i++) {
  //   for (int j = 1; j < arrS.length; j++) {
  //     if(arrS[i].equals(arrS[j])){
  //       // sb.append(arrS[i]);
  //       arrS2[i] = arrS[j];
  //     }
  //   }
  // }
  return longesSub;
}

  // you should define the shortest string and iterate through it
int matchChar(String s1, String  s2){
  String shortest[];
  String longest[];
  if (s1.length() < s2.length()) {
    shortest = s1.split("");
    longest = s2.split("");
  } else {
    shortest = s2.split("");
    longest= s1.split("");
  }
  Arrays.sort(longest);
  Arrays.sort(shortest);
  int count = 1;
  for (int i = 0; i < shortest.length; i++) {
    for (int j = 0; j < longest.length; j++) {
      if (shortest[i] == longest[j]) {
        count++;
      }
    }
  }
  return count;
}

// String[] repeatingChars(String[] s){
//   String[] norep;
//   NOREP: for (int i = 0; i < s.length; i++) {
// for (int j = i+1; j < s.length; j++) {
//   if (s[i] != s[j]) {
//     norep[i] =s[j];
//   } else {
//     continue NOREP;
//   }
// }  
// }

// }

//   for (int i = 0; i < shortest; i++) {
// if (s1.charAt(i) == s2.charAt(i)) {
//   count++;
// }    
//   }


  // Q10
  // 1for to iterate through and find (
    // for loop to identify inner ()
  // 2for to 
  // IF contains (var ..n)
  // sb= string
  // sb.replace(substring(i, i +n), substring(i, i +n).reverse )
  // store the indexes
  // reevaluate start and finish indexes as new( ) are detected through first iteration
  //after replacing the inner call the function again

  // find equivalent ()
  StringBuilder findBrackets(StringBuilder sb){ //
    int countS = 0;
    int countF = 0;
    int start = 0;
    int finish = 0;
    BRACKET: for (int i = 0 ; i < sb.length(); i++) {
      if(sb.charAt(i) == '('){
        start = i;
        countS++;
      }
       else if (sb.charAt(i) == ')') {
        finish =i;
        countF++;
      }
      else continue BRACKET;
    }
    if (start >= finish || (sb.indexOf("(") == -1 || sb.indexOf(")") == -1) ) {
    System.out.println("Invalid input! Inputted string must contain bracket pairs.");
    // try {
      
    // } catch (Exception e) {
    //   // TODO: handle exception
    // }
    }
    StringBuilder sb2 = new StringBuilder();
     String result = sb2.append(sb.substring(start+1, finish)).reverse().toString();
    System.out.println("Start i ndex is: " + start);
    System.out.println("Finish index is: " + finish);
    sb.replace(start, finish+1,result); //int,int, String 
    return  sb;
  }

  // StringBuilder revInsBrack(StringBuilder sb){
  //   //how to view start and finish here
  //     return sb;
  //   }
  //TODO:

  // Find if the sequence of the letters can be turned into palindrome words
  // o(countOdd = 1; length =1); aao(countOdd = 1, countEven =1, length = 3); aabb(countEven = 2; countOdd = 0; length = 4);
  boolean palDist(String s){
    boolean isPalindrome = true;
    int countEven = 0;
    int countOdd = 0;
    for (int i = 0; i < s.length()-1; i++) {
      for (int j = i+1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
        countEven++;
      }
        else countOdd++;
      }
    }
    if ((countEven + countOdd) %2 != 0) {
      isPalindrome = true;
    }
    else isPalindrome = false;
    return isPalindrome;
  }
  int containsElement(String s1, String s2){
    //longest, shortest
int count = 0;
StringBuilder sb = new StringBuilder(s2);
for (int i = 0; i < s1.length(); i++) {
  if (s1.contains(sb.substring(i, i+1))) {
    count++;
  }
}
  
return count;
  }
  public static void main(String[] args) {
    Hw_strings hw = new Hw_strings();
    System.out.println(hw.containsElement("nu", "nun"));
    // System.out.println(hw.palindrome("nun"));
    // List<Integer> ages = new ArrayList<>();
    // ages.add(Integer.parseInt("5"));
    //  ages.add(Integer.valueOf("6"));
    //  ages.add(7);
    //  ages.add(null);
    //  for (int age : ages) System.out.println(age);
    // StringBuilder sb = new StringBuilder("(AB(CD))");
    // StringBuilder sb2 = new StringBuilder("(AB(CD))");
    // String string1 = "We have acompany";
    // String string2 = "We have acompany2";
    // System.out.println( Integer.valueOf("0"));
    // String[] a1 = {"1", "2", "3"};
    
    // System.out.println(hw.compareSub(string1, string2));
    // String[] s = a.split("");
    // Arrays.sort(s);
    // StringBuilder sbb = new StringBuilder("hoho");
    // hw.sba(sbb);
    
    // System.out.println(sbb);
    
    // for (String string : s) {      
      //   System.out.println(string);
      // }
      // System.out.println( hw.matchChar("abba", "aba"));
      
  // }
  // public void sba(StringBuilder sb ){
    //   System.out.println(sb.append("OOOO"));
    // }
  }
}

