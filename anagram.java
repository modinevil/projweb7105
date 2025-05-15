import java.util.*;
class Main{
  public static void main(String[] args){
    String s1="listen";
    String s2="silent";
    char[] a1=s1.toCharArray();
    char[] a2=s2.toCharArray();
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(a2));
    Arrays.sort(a1);
    Arrays.sort(a2);
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(a2));
    String news1=new String(a1);
    String news2=new String(a2);
    if(news1.equals(news2)){
      System.out.println("anagram");
    }
    else{
      System.out.println("not anagram");
    }
    }
}