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
    System.out.println("-----------------------------");
    ls.reverseOfLinkedList();
    ls.print();
    System.out.println("-----------------------------");
    ls.removeElementFromLast();
    ls.print();
    System.out.println("-----------------------------");
    ls.revomeFirstElement();
    ls.print();
    System.out.println("-----------------------------");
    ls.removeIndexElement(2);
    ls.print();
  }
}
////////////////////////////////////////////////////////////////
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
/////////////////////////////////////////////////////////////////
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
///////////////////////////////////////////////////////////////
void revomeFirstElement(){
        if (head == null){
            System.out.println("No element found");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        head = head.next;

    }
///////////////////////////////////////////////////////////////
int Findlength(){
  int counter=1;
  Node temp=head;
  while(temp.next!=null){
    temp=temp.next;
    counter++;
  }
  return counter;
}
//////////////////////////////////////////////////////////
void removeIndexElement(int index){
  if(head==null || index>=Findlength()){
    System.out.println("no elements to remove");
    return;
  }
  Node temp=head;
  for(int i=1;i<index;i++){
    temp=temp.next;
  }
  temp.next=temp.next.next;
}
////////////////////////////////////////////////////////
void removeElementFromLast(){
  if(head==null){
    System.out.println("no element to remove");
    return;
  }
  
  if(head.next==null){
    head=null;
    return;
  }
  Node temp=head;
  
  while(temp.next.next!=null){
    temp=temp.next;
  }
  temp.next=null;
}
////////////////////////////////////////////////////////////////
void reverseOfLinkedList(){
  if(head==null || head.next==null){
    System.out.println("no element to reverse");
    return;
  }
  Node prev=null;
  Node current=head;
  Node follow;
while(current!=null){
  follow=current.next;
  current.next=prev;
  prev=current;
  current=follow;
}
head=prev;
}
}
////////////////////////////////////////////////////////////////
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    next=null;
  }
}
