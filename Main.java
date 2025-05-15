import java.util.*;

public class Main {
    public static void main(String[] args) {
      String data="Parul University";
      data.toUpperCase();
      System.out.println(data);
      
      StringBuffer bf=new StringBuffer("Hello");
      bf.append(" Student ");
      System.out.println(bf);
      
      bf.insert(6,"Smart ");
      System.out.println(bf);
      
      bf.replace(0,2,"A");
      System.out.println(bf);
      
      bf.delete(5,11);
      System.out.println(bf);
      
      bf.reverse();
      System.out.println(bf);
      bf.reverse();
      
      bf.setCharAt(3,'Z');
      System.out.println(bf);
      
  }
}