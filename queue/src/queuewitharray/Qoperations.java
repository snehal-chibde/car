package queuewitharray;

public class Qoperations extends Qmethods {

int qSize,front,rear;
int numarray[];

  public Qoperations(int qSize) {
	super();
	this.front=0;
	this.rear=0;
	this.qSize = qSize;
	this.numarray=new int[qSize];
  }
  
  public boolean enque(int ele){
	  if(rear<=qSize-1){
		  
		  numarray[rear]=ele;  
		  rear++;
		  return true;
	  }
	  else
		  return false;
	   }

public void deque(){
	int i;
	if(rear>=0){
		System.out.println("ele dequed" );
		
		for(i=0;i<rear;i++)
		numarray[i]=numarray[i+1];
		rear--;
		//System.out.println(numarray[i]);
	}
	else
	System.out.println("underflow");
  }
	
public void display(){
	System.out.println("the queue elements are ");
	for (int i=front;i<rear;i++){
		System.out.println(numarray[i]);
	 }
   }
 }
