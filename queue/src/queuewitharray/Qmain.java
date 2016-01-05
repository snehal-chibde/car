package queuewitharray;

public class Qmain 
{
	public static void main(String args[]){
		
		Qmethods qm=new Qoperations(5);
		qm.enque(5);
		qm.enque(4);
		qm.enque(2);
		qm.enque(25);
		qm.display();
		qm.deque();
		qm.display();
		Qmethods arr=new Arraylist(8);
		arr.enque(80);
		arr.enque(66);
		 arr.display();
	}	
	
	}
