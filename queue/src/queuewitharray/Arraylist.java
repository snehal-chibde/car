package queuewitharray;

import java.util.*;

public class Arraylist  extends Qmethods {

	int qSize,front,rear;
	int numarray[];

	  public Arraylist(int qSize) 
	  {
		  super();
		this.front=0;
		this.rear=0;
		this.qSize = qSize;
		this.numarray=new int[qSize];
	  }
	  
	  ArrayList a= new ArrayList<>(10);
	  
	  
	  public boolean enque(int ele)
	  {
		  
		  a.add(ele);
		 	return false;
		   }

	public void deque(){
		if (a.isEmpty())
		{
			System.out.print("empty list");
		}
		else
		{
			a.remove(0);
		}
	  }
		
	public void display(){
		System.out.println("arraylist ele are : " +a);
			
			
		
		 }
	   
	 }
	
	
