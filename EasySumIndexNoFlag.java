import java.util.Scanner;

public class EasySumIndexNoFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
              for(int k=j+1;k<size;k++){
                if (arr[i] + arr[j]+arr[k] == target) {
                    System.out.println("Index: " + i + " and " + j+" and "+k);
                    return; 
                }
            }
        }
}
        System.out.println("No matching pair found.");

        sc.close();
    }
}
