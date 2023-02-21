package main.java.com.example.str2;

import java.util.Arrays;

public class Hw_strings {
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
  // 
  // Q9
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
  
  public static void main(String[] args) {
    Hw_strings hw = new Hw_strings();
    System.out.println(hw.palindrome("nun"));
    StringBuilder sb = new StringBuilder("bas");
    System.out.println(sb.reverse());
    // System.out.println(a);
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
