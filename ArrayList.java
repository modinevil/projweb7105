import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     ArrayList<Integer> ls=new ArrayList<Integer>();
     ls.add(11);
     ls.add(12);
     ls.add(13);
     ls.add(14);
     ls.add(15);
     ls.add(16);
     System.out.println(ls);
     for(Integer l:ls){
       System.out.println(l);
     }
     System.out.println(ls.get(2));
     ls.add(2,88);
     System.out.println(ls);
     ls.set(2,10);
     System.out.println(ls);
     ls.remove(2);
     System.out.println(ls);
     System.out.println(ls.size());
     System.out.println(ls.contains(11));
     System.out.println(ls.indexOf(12));
     ArrayList<Integer> anotherList=new ArrayList<Integer>();
     anotherList.add(17);
     anotherList.add(18);
     anotherList.add(19);
     anotherList.add(20);
     ls.addAll(anotherList);
     System.out.println(ls);
  }
}