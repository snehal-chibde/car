package queuewitharray;

public class Qoperations {

int qSize,front=0,rear=0;
int numarray[];
  public Qoperations(int qSize) {
	super();
	this.qSize = qSize;
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
