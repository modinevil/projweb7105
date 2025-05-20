import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
      // Insertion Sort
      int[] arr={6,9,3,7,2,4};
      for(int i=1;i<arr.length;i++){
        int ele=arr[i];
        int j=i-1;
        while(j>=0 && ele<arr[j]){
          arr[j+1]=arr[j];
          j--;
        }
        arr[j+1]=ele;
    }
    System.out.println(Arrays.toString(arr));
  }
}