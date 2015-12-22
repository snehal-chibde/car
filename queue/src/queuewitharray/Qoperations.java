package queuewitharray;

public class Qoperations {

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
		  return true;
	  } 
	  return false;	 
  }

public void deenque(){
	
	  
  }
	
}
