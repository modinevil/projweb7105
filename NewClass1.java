public class NewClass1 {
  public static void main(String[] args){
    find("abcd",0,"");
  }
   static void find(String str,int index,String result){
    if(str.length()==index){
      System.out.println(result);
      return;
    }
    find(str,index+1,result+str.charAt(index));
    find(str,index+1,result);
  }
}