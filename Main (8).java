import java.util.*;

public class Main {
    public static void main(String[] args) {
     Student s1=new Student();
     Student s2=new Student();
     
     s1.name="Nevil";
     s1.roll=13;
     s1.height=185;
     s1.weight=70;
     

     s2.name="xyz";
     s2.roll=15;
     s2.height=175;
     s2.weight=63;
     System.out.println(s1==s2);
     System.out.println("s1 roll :"+s1.roll+" s2 roll :"+s2.roll);
  }
}
  class Student{
    String name;
    int roll;
    double height;
    float weight;
    void study(){
      System.out.println("study");
    }
  }
