




class LinkedList1
{
    int length =0;
    class Node
    {
        int data;
        Node next;
        
        //constructor for node
        Node(int d) {data = d;}
    
    }
    
    Node head; //for head of the linked list
    
    
    public String toString()
    {
        Node p = head;
        String s="";
        while(p != null)
        {
            s += Integer.toString(p.data)+ " ";
            p = p.next;
        }
        
        return s;
    }
    
    public boolean isEmpty()
    {
        if (length==0) return true;
        else return false;
    }
    
    public void insertFirst(int x)
    {
        Node n = new Node(x);
        
        n.next = head;
        
        head = n;
        
        length++;
    }
    
    public void insertAfter(Node prevNode, int x)
    {
       if(prevNode == null) 
       {
           System.out.println("The previous node can't be null");
       }
       
       Node n = new Node(x);
       
       n.next = prevNode.next;
       
       prevNode.next = n;
       
       length++;
    }
    
    public void insertLast(int x)
    {
        Node n = new Node(x);
        
        //if list empty
        if(head == null)
        {
            head = n;
            length++;
        }
        else
        {
            n.next = null;
            //since n is going to be the last node
            Node p = head;
            
            //traverse till last node reached
            while(p.next != null) p=p.next;
            
            p.next = n;
            length++;
        }
        
    }
    
    public int deleteFirst()
    {
     int tmp = head.data;
     head = head.next;
     
     length--;
     return tmp;
     
    }
    
    public int deleteLast()
    {
        Node p = head;
        
        while(p.next.next != null) p = p.next;
        int tmp = p.next.data;
        p.next = null;
        
        length--;
        return tmp;
    }
    
    
    
    
    
}

class Queue
{
    private LinkedList1 list = new LinkedList1();
    
    public int length(){ return list.length;}
    
    public void enqueue(int x)
    {
        list.insertLast(x);
    }
    
    public int dequeue()
    {
        return list.deleteFirst();
    }
    
    public void printQueue()
    {
        System.out.println(list);
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
}

public class QueueThroughLinkedList {
    
    public static void main(String[] args) {
        Queue q  = new Queue();
        System.out.println(q.isEmpty());
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        
        q.printQueue();
        
        System.out.println(q.isEmpty());
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        q.printQueue();
        
        
    }
    
    
    
}


