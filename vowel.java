public class NewClass1 {
  public static void main(String[] args){
    String data="Nevil";
    int vowel=0;
    int consolent=0;
    for(int i=0;i<data.length();i++){
      char ch=data.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        vowel++;
      }
      else{
        consolent++;
      }
    }
    System.out.println("vowel :"+vowel);
    System.out.println("consolent :"+consolent);
    }
}