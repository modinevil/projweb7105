import java.util.*;

public class Main {
    public static void main(String[] args) {
      // find the all possible  substring form the given stirng 
      // using for lopp
      // using recurssion
      String data="abcd";
      for(int i=0;i<=data.length();i++){
        for(int j=i+1;j<=data.length();j++){
          System.out.println(data.substring(i,j));
        }
      }
  }
}