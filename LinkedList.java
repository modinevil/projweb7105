import java.util.*;

public class Main {
    public static void main(String[] args) {
     MyLinkedList ls=new MyLinkedList();
    ls.add(12);
    ls.add(13);
    ls.add(14);
    ls.add(15);
    ls.add(16);
    ls.print();
  }
}
class MyLinkedList{
  Node head;
  void add(int xyz){
  if(head==null){
    head=new Node(xyz);
    return;
  }
  Node temp=head;
  while(temp.next!=null){
    temp=temp.next;
  }
  temp.next=new Node(xyz);
}
void print(){
  if(head==null){
    System.out.println("element not found");
    return;
  }
  Node temp=head;
  System.out.println(head.data);
  while(temp.next!=null){
    temp=temp.next;
    System.out.println(temp.data);
  }
}
}
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    next=null;
  }
}