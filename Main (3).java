import java.util.*;

public class Main {
    public static void main(String[] args) {
         int[] myArray = {1, 2, 3, 4, 5};
   int start = 1; 
   int end = 3;  
   int sum = 0;

   for (int i = start; i <= end; i++) {
       sum += myArray[i];
   }
   System.out.println("Sum of elements from index " + start + " to " + end + ": " + sum);
  }
}