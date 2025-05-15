import java.util.*;

public class Main {
    public static void main(String[] args) {
    System.out.println(facto(8));
  }
  static int facto(int a){
    if(a==1){
      return 1;
    }if(a<1){
      System.out.println("use proper value");
      System.exit(0);
    }
    return a*facto(a-1);
  }
}