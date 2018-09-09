


import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.Semaphore;



class Student
{
    private String name;
    private int marks;

    public Student(String x, int y) {
        name = x;
        marks = y;
    }
    
    public String toString()
    {
        return name+" : "+marks;
    }
    
    
}

class Q 
{ 
    
   
    LinkedList<Student> item;
      
     
    static Semaphore semCon = new Semaphore(0); 
      
    static Semaphore semProd = new Semaphore(1); 
      
    
    void get() 
    { 
        try { 
             
            semCon.acquire(); 
        }  
        catch(InterruptedException e) { 
            System.out.println("InterruptedException caught"); 
        } 
          
        
        System.out.println("Consumer consumed item : " + item); 
          
        
        semProd.release(); 
    } 
      
    
    void put(LinkedList<Student> item) 
    { 
        try { 
            
            semProd.acquire(); 
        } catch(InterruptedException e) { 
            System.out.println("InterruptedException caught"); 
        } 
          
        
        this.item = (LinkedList<Student>) item.clone(); 
        
        System.out.println("Producer produced item : " + this.item); 
          
               semCon.release(); 
    } 
}





class Producer implements Runnable 
{ 
    LinkedList<Student> list = new LinkedList<>();
    private int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
    }

    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
    
    }
    
    private String names[] = {"John", "Abhi", "Ram", "Shweta","Mini", "Shyam","Dilien"};
    
    private Student getStudent()
    {
        int marks = getRandomNumberInRange(0,100);
        int ind = getRandomNumberInRange(0, names.length-1);
        
        
        
        return new Student(names[ind], marks);
        
    }
    
    Q q; 
    Producer(Q q) { 
        this.q = q; 
        new Thread(this, "Producer").start(); 
    } 
      
    public void run() { 
        for(int i=0; i < 5; i++)
        {
            for(int j =0; j<3; j++)
            {
                list.add(getStudent());
            }
            q.put(list);
            list.clear();
        }
    } 
} 
 

class Consumer implements Runnable 
{ 
    Q q; 
    Consumer(Q q){ 
        this.q = q; 
        new Thread(this, "Consumer").start(); 
    } 
      
    public void run() 
    { 
        for(int i=0; i < 5; i++)  
             
            q.get(); 
    } 
} 
  

public class ProducerConsumerTest 
{ 
    public static void main(String args[])  
    { 
         
        Q q = new Q(); 
          
         
        new Consumer(q); 
          
        
        new Producer(q); 
    } 
} 
