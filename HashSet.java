import java.util.HashSet;
public class NewClass1 {
  public static void main(String[] args){
    HashSet<Integer> set=new HashSet<Integer>();
    //under red
    //does not allow duplicat
    set.add(11);
    set.add(22);
    set.add(33);
    set.add(44);
    set.add(55);
    set.add(55);
    System.out.println(set);
  }
}