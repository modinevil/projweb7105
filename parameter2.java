
 class Main{
   public static void main (String[] args) {
     int value=10+func()+func2();
    System.out.println(value);
 }
 static int func(){
   // if you use other function than always write return keyword
   //function return something than the whole value become the function
   return 12;
 }
 static int func2(){
   int a=10;
   int b=20;
   int c=a+b;
   return c;
 }
}