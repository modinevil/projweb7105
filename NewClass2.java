public class NewClass2 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass2 instance2 = new NewClass2();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance2.sayHelloFromNewClass());

  public static void main(String[] args){
    Student s=new Student(12,"Student");
    Student s1=new Student(13,"alakh");
    //s.roll=12;
    //s.name="Sumit";
    System.out.println(s.roll+" "+s.name);
    System.out.println(s1.roll+" "+s1.name);
    s.study();
  }

}
class Student{
  int roll;
  String name;
  
  void study(){
    System.out.println("Study");
  }
  Student(int r,String n){
    roll=r;
    name=n;
  }
  void display(){
    System.out.println(roll);
    System.out.println(name);
  }
}