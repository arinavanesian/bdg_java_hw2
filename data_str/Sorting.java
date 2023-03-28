package main.java.com.example.data_str;

public class Sorting {
  public static int linearSearch(int[] arr, int result){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == result) {
        return result;
      }
    }
    return -1;
  }
  public static int binarySearch(int[] arr, int value){
    int low = 0;
    int high = arr.length -1;
    while (low <= high) {
      int middle = low + (high - low)/2;
      System.out.println("middle: " + middle);
      int target = arr[middle];
      if (target < value) {
        low = middle +1;        
        System.out.println("Searching between" + low + " and "+ high);
      } else if(target > value){
        high = middle - 1;
        System.out.println("Searching between" + low + " and "+ high);
      }
      else {
        System.out.println("Element foud at index: " + middle);
      return middle;}
    }
    System.out.println("Element not foud");
    return -1;
  }

  public static int interpolationSearch(int[] arr, int value){
    int high = arr.length -1;
    int low = 0;
    while (value >= arr[low] && value<=arr[high] && low <= high) {
      int probe = low + (high -  low) *(value -arr[low])/
      (arr[high] - arr[low]);
      System.out.println( "probe: " + probe);
      if (arr[probe] < value) {
        low = probe +1;
        System.out.println("Searching between: " + low+ " and " + high);
      } else if(arr[probe] > value) {
        high = probe - 1;
        System.out.println("Searching between: " + low+ " and " + high);
      }
      else {
        System.out.println("Probe you were looking for is: " + probe);
        return probe;
      }
    }
    return -1;
  }

  // public static void bubbleSort(int[] arr){

  //   for (int i = 0; i < arr.length-1; i++) {
  //     for (int j = 0; j < arr.length - i -1; j++) {
  //       if(arr[j+1] < arr[j]){
  //         int temp = arr[j];
  //         arr[j] = arr[j+1];
  //         arr[j+1] = temp;
  //       }
  //     }
  //   }
  // }

  // public static void selectionSort(int[] arr){
  //   int min = 0;
  //   for (int i = 0; i < arr.length-1; i++) {
  //     min = i;
  //     for (int j = i+1; j < arr.length; j++) {
        
  //       if(arr[min]> arr[i+1]){
  //         min =j;
  //       }
  //     }
      
  //       int temp  = arr[j];
  //       arr[i] = arr[i+1];
  //       arr[i+1] =temp;
      
  //   }
    
  // }
  // public static void selectionSort(int[] arr){
  //   for (int i = 0; i < arr.length-1; i++) {
  //     for (int j = 0; j < arr.length; j++) {
        
  //     }
  //   }
  // }
public static void insertionSort(int[] array) { //{2, 4, 5, 1, 3}
    for (int i = 1; i < array.length; i++) {
        int current = array[i]; //1
        int j = i - 1; //2
        while(j >= 0 && current < array[j]) { // 1 < 5
            array[j+1] = array[j];
            j--;
        }        
        array[j+1] = current; //
    }
}
  public static void swap(int a[], int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}       
public static void  selectionSorting(int[] arr){
  for (int i = 0; i < arr.length-1; i++) {
    int min = arr[i];
    for (int j = i+1; j < arr.length; j++) {
      if(min > arr[j]){
        swap(arr, i, j);
      }
      min =arr[j];
    }
    
  }
}

//charSum
// compareTo()
// 
public void changeM(String[][] n){
  for (int i = 0; i < n.length; i++) {
    
    for (int j = 0; j < n.length; j++) {
      int sumEachString = sumChar(n[i][j]);
      if (sumEachString) {
        
      }
      
    }
      //so that this if is the result
      // if(n[i][j].compareTo(n[i][j+1]) !=1){
            // swap(n[i], j, j+2);
      }
    }
  }
 public static int sumChar(String c){
  int sum =0;
  char[] charArray = c.toCharArray();
  for (int i = 0; i < charArray.length; i++) {
    sum +=charArray[i];
  }
  return sum;
 }
  public static void main(String[] args) {
    Sorting s = new Sorting();
    int[] myAr = {10, 11, 22, 25, 77, 888, 1000, 1223, 14343 };
    int[] notSorted = {23, 4, 55, 667, 3323, 2};
    s.selectionSorting(notSorted);
    for (int i : notSorted) {
      System.out.println(i);
    }
    "aa".toCharArray().sum();
  }
}
