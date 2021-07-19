//LinkedList implementation
import java.util.LinkedList;
class LList
{
  public static void main(String args[])
  {
    LinkedList<String> ll =new LinkedList<>();
    ll.add("Dog");
    ll.addFirst("CAt");
    ll.add("Pig");
    ll.addLast("Kangaru");
    ll.add("ret");
 
    System.out.println("list are: "+ll);
    System.out.println("First elemt is: " + ll.getFirst()); 
    System.out.println("Last elemnt is: " + ll.getLast());

  }

}     


  

 