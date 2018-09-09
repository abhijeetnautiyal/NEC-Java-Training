import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

abstract class Worker
{
	protected double salary;
	protected String name;
	public abstract void pay();
	public abstract void setName(String x);
	public abstract double getPay();
	public abstract void toStr();
	//protected String type = "";
	
	
}

class DailyWorker extends Worker
{
	private int days;
	int pay_per_day = 50000;
	public void setDays(int x) {days = x;}
	
	public void pay()
	{
		int sal;
		salary =  pay_per_day*days;
	}

	
	public void setName(String x) {
		name = x; 
		
	}
	public double getPay() {return salary;}

	
	public void toStr() {
		System.out.println("Name  : "+ name);
		System.out.println("Salary: "+ salary);
		System.out.println("Type  : "+this.toString().substring(0,11));
		
	}

	
	
}

class SalariedWorker extends Worker
{
	private int weeks;
	private int pay_per_week = 20000;
	
	public void setWeeks(int x) {weeks = x;}
	
	
	public void pay() {
		
		salary =  weeks*pay_per_week;
	}
	public void setName(String x) {
		name = x; 
		
	}
	public double getPay() {return salary;}
	
	public void toStr() {
		System.out.println("Name  : "+ name);
		System.out.println("Salary: "+ salary);
		System.out.println("Type  : "+this.toString().substring(0,14));
		
	}
	
	
}
class MyComp implements Comparator<Worker>{
	 
   
	public int compare(Worker w1, Worker w2) {
		if (w1.getPay() < w2.getPay()) return 1;
		else return -1;
		
		
	}
}


public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DailyWorker d1 = new DailyWorker();
		d1.setName("Arun");
		d1.setDays(23);
		d1.pay();
		
		
		DailyWorker d2 = new DailyWorker();
		d2.setName("Anjali");
		d2.setDays(28);
		d2.pay();
		
		DailyWorker d3 = new DailyWorker();
		d3.setName("Ram");
		d3.setDays(31);
		d3.pay();
		
		SalariedWorker s1 = new SalariedWorker();
		s1.setName("Divya");
		s1.setWeeks(3);
		s1.pay();
		
		SalariedWorker s2 = new SalariedWorker();
		s2.setName("Shiv");
		s2.setWeeks(3);
		s2.pay();
		
		SalariedWorker s3 = new SalariedWorker();
		s3.setName("Gautam");
		s3.setWeeks(3);
		s3.pay();
		
		LinkedList<Worker> list = new LinkedList<Worker>();
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list,new MyComp());
		
		for(int i=0; i<list.size(); i++)
		{
			Worker tmp = list.get(i);
			tmp.toStr();
			System.out.println("---------------------------");
		}
		
		
		
		
		
		
		
		
		

	}

}
