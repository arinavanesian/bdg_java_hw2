package main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lists_hw {
  public static boolean  iterateArrayList(ArrayList<Integer> intA){
    if (intA.isEmpty()) {
      System.out.println("The ArrayList is empty");
      return false;
    } 
      for (int i = 0; i < intA.size(); i++) {
        System.out.println(i+1 + " member of the ArratList: " + intA.get(i));
      }
      return true;
    }

    public static Object addFirst(ArrayList<Integer> intA, int element){
      intA.add(0, element);
      return intA.get(0);
    }
    public static boolean replaceElement(ArrayList<Integer> list, int element, int newElement) throws IllegalAccessException {
      try {
        for (int i = 0; i < list.size(); i++) {
          if (list.get(i) == element) {
            element = newElement;
          }
        
        }
        
      } catch (Exception e) {      
        throw new IllegalAccessException("Such element doesn't exist!");
      }
      return true;
    }

    //17
    public void insertSequence(){      
      ArrayList<Integer> sequence = new ArrayList<Integer>();
      System.out.println("Insert a sequence of positive numbers.");
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());
        while (!(scanner.nextLine().isBlank())) {
          if (number <= 0) {
            System.out.println("Please enter a positive integer");
            continue;
            }
            sequence.add(number);
        }        
        int sum = 0;
        for (int n : sequence) {
            sum += n;
        }
        double average = (double) sum / sequence.size();
        System.out.println("Sequence: " + sequence);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
    public static void swap(ArrayList<Integer> list, int i, int j){
      int temp = list.get(i);
      list.set(i, j);

  } 
    public ArrayList sequenceSorting(){
      ArrayList<Integer> numberList = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      int number = Integer.parseInt(sc.nextLine());
      while(!sc.nextLine().isBlank()){
        numberList.add(number);
      }

      for (int i = 0; i < numberList.size()-1; i++) {
        int min = numberList.get(i);
        for (int j = i+1; j <  numberList.size(); j++) {
          if(min >  numberList.get(j)){
            swap(numberList, i, j);
          }
          min =numberList.get(j);
        }  
      }
      return numberList;
    }

      

    public static void main(String[] args) throws IllegalAccessException {
      Lists_hw lw = new Lists_hw();
      ArrayList<Integer> intA = new ArrayList<>(Arrays.asList(1, 2, 4, 55));
      // lw.insertSequence();
      System.out.println(intA);
    }
  }

