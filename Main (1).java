import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] arr={1,4,8,2,7,4,9};
      int left=0;
      
      int right=arr.length-1;
      int mid=(left+right)/2;
      
      int n1=left+mid+1;
      int n2=right-mid;
      
      int[] R=new int[n2];
      int[] L=new int[n1];
      
      for(int i=0;i<n1;i++){
        L[i]=arr[i];
      }
      
      for(int i=0;i<n2;i++){
        R[i]=arr[mid+1+i];
      }
      
      System.out.println(Arrays.toString(L));
      System.out.println(Arrays.toString(R));
      int i=0,j=0,k=left;
      while(i<n1 && j<n2){
        if(R[i]<=L[i]){
          arr[k]=R[i];
          i++;
        }else{
          arr[k]=L[j];
          j++;
        }
        k++;
      }
      while(i<n1){
        arr[k]=R[i];
        i++;
        k++;}
        while(j<n2){
          arr[k]=L[j];
          j++;
          k++;
        }
    }
  }