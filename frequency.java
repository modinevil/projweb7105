import java.util.*;

public class Main {
    public static void main(String[] args) {
      //check the frequancy of every String// 
      String data="Hello World";
      int[] freq=new int[256];
      for(int i=0;i<data.length();i++){
        char ch=data.charAt(i);
        int ascii=(int)ch;
        freq[ch]++;
      }
      for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
          System.out.println((char)i+"=>"+freq[i]);
        }
      }
  }
}
