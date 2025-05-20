import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      String data="({[]}";
      Stack<Character> st=new Stack<Character>();
      for(int i=0;i<data.length();i++){
        char ch=data.charAt(i);
        if(ch=='(' || ch=='[' || ch=='{'){
          st.push(ch);
        }
        else{
          // )]}
          if(ch==')' && st.peek()=='(' ||
             ch=='}' && st.peek()=='{' ||
             ch==']' && st.peek()=='['){
               st.pop();
             }
          }
        }
        if(st.isEmpty()){
          System.out.println("paranthesis are equal");
        }else{
          System.out.println("paranthesis are not equal");
        }
      }
  }