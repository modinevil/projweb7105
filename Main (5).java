import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      int arr[]={3,4,9,11,13,15};
      int e=13;
      int flag=0;
      int start=0;
      int end=arr.length-1;
      while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==e){
          flag=1;
          break;
        }
        if(e<=arr[mid]){
          end=mid-1;
        }
        if(e>arr[mid]){
          end=mid+1;
        }
      }
      if(flag==1){
        System.out.println("found");
      }
      else{
        System.out.println("not found");
      }
  }
}