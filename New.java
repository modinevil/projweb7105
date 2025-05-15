import java.util.Arrays;
public class New{
  public static void main(String[] args){
    int[] arr={12,345,67,1,2,3,4,5};
    int index=5;
    int counter=0;
    int[] newArr=new int[arr.length-1];
    for(int i=0;i<arr.length;i++){
      if(i!=index){
        newArr[counter]=arr[i];
        counter++;
      }
    }
    System.out.println(Arrays.toString(newArr));
  }
}