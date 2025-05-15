public class NewClass1 {
  public static void main(String[] args){
    String name="madam";
    String result="";
    for(int i=name.length()-1;i>=0;i--){
      result=result+name.charAt(i);
    }
    System.out.println(result);
    if(name.equals(result)){
      System.out.println("palindrome");
    }
    else{
      System.out.println("not palindrome");
    }
  }
}