public class Main {
    public static void main(String[] args) {
      String data="ppccp";
      System.out.println(FindMinHealthiness(data));
  }
  static String swap(String str,int i,int j){
    char arr[]=str.toCharArray();
    char temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    String swapped=new String(arr);
    return swapped;
  }
  static int FindMinHealthiness(String str){
    int oldHeath=FindHealthiness(str);
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        String swapped=swap(str,i,j);
        int newHeath=FindHealthiness(swapped);
        oldHeath=Math.min(oldHeath,newHeath);
      }
    }
    return oldHeath;
  }
  static int FindHealthiness(String str){
    //str=ppccp//4
    int healthiness=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='p'){
        for(int j=0;j<i;j++){//0...3
          char prev=str.charAt(j);
          if(prev=='c'){
            healthiness++;
              }
            }
          }else{
            for(int j=i+1;j<str.length();j++){
             char next=str.charAt(j); 
             if(next=='p'){
               healthiness++;
             }
        }
      }
    }
    return healthiness;
  }
}