//implement linkedList bethout using inbuilt funtion
class LList1
{
    Node head;
    
    static class Node
    {
     int value;
     Node next;
     
     Node(int d)
     {
      value=d;
      next=null;
     }
    }
    
  public static void main(String args[])
  {
   LinkedList ll=new LinkedList();
   ll.head=new Node(1);
   Node second=new Node(2);
   Node third =new Node(3);
   
   ll.head.next=second;
   second.next=third; 
    
  System.out.println("LinkedList are: ");
   while(ll.head!=null);
   {
    System.out.print(ll.head.value + " ");
      ll.head = ll.head.next;
    }

}
}
  