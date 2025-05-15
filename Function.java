import java.util.*;

public class Function {
    public static void main(String[] args) {
      String data="programming";
      String data2="java";
      System.out.println(data.length());
      System.out.println(data.charAt(8));
      System.out.println(data.substring(3,7));
      System.out.println(data.compareTo(data2));
      System.out.println(data.toUpperCase());
      System.out.println(data.toLowerCase());
      System.out.println(data.trim());
      System.out.println(data.indexOf("i"));
      System.out.println(data.lastIndexOf("g"));
      System.out.println(data.replace('a','e'));
      System.out.println(data.contains("gra"));
      System.out.println(data.startsWith("pro"));
      System.out.println(data.endsWith("min"));
  }
}