public class NewClass1 {
  public static void main(String[] args){
    String data="Nevil@1 234";
    int vowel=0;
    int consolent=0;
    int num=0;
    int space=0;
    int special=0;
    for(int i=0;i<data.length();i++){
      char ch=data.charAt(i);
      if(Character.isLetter(ch)){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        vowel++;
      }
      else{
        consolent++;
      }
      }
      else if(Character.isDigit(ch)){
        num++;
      }
      else if(Character.isWhitespace(ch)){
        space++;
      }
      else{
        special++;
      }
      }
    System.out.println("vowel :"+vowel);
    System.out.println("consolent :"+consolent);
    System.out.println("num :"+num);
    System.out.println("space :"+space);
    System.out.println("special :"+special);
    }
}