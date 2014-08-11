import java.util.Stack;


public class stackDemo {

	
	Stack s = new Stack();
	
	stackDemo(){
		
		addItem(1802);
		addItem(1805);
		addItem(1807);
		addItem(1809);
		
		System.out.println( getItem() );
		System.out.println( getItem() );
		
		
	}
	
	void addItem(int value){
		s.push(value);
	}
	
	int getItem(){
		return (Integer)s.pop();
	}
	
	public static void main(String[] args) {
	new stackDemo();

	}

}
