import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      // stack 
      String data="hello";
      System.out.println("original String :"+data);
      Stack<Character> st=new Stack<Character>();
      String reverse="";
      for(int i=0;i<data.length();i++){
        st.push(data.charAt(i));
      }
      for(int i=0;i<data.length();i++){
        reverse=reverse+st.pop();
      }
     System.out.println("reverse String :"+reverse); 
  }
}