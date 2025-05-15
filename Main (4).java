import java.util.*;

public class Main {
    public static void main(String[] args) {
     int a[]={10,20,30,40,50,60};
     int start=0;
     int end=6;
     System.out.println("original value :"+a[3]+" "+a[4]);
     a[3]=a[3]+a[4];
     a[4]=a[3]-a[4];
     a[3]=a[3]-a[4];
     System.out.println("swap value :"+a[3]+" "+a[4]);
     }
}