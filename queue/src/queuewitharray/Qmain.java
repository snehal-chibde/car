package queuewitharray;

public class Qmain 
{
	public static void main(String args[]){
		
		Qmethods qm=new Qoperations(5);
		qm.enque(5);
		qm.enque(45);
		qm.enque(5);
		qm.enque(25);
		qm.deque();
		qm.display();
		Qmethods arr=new Arraylist(8);
		arr.enque(12);
		arr.display();
		 
	}	
	
	}
