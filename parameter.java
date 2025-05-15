import java.util.*;

public class Main {
    public static void main(String[] args) {
      // functon name
      // block of the function
      // argument or parameter
      // return Type
      // if you are calling any function insidde the the function is static function
      merafunction();
      terafunction(12);
      terafunction(1000);
      sabkafunction(20,34);
      sabkafunction(1,5);
  }
  static void merafunction(){
    System.out.println("useless function 😂😂");
  }
  // no return type with parameter
  static void terafunction(int n){
    System.out.println(n+20);
  }
  static void sabkafunction(int a,int b){
    System.out.println(a+b);
  }
}