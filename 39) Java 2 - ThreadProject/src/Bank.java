
public class Bank {

	
	double[] accounts = {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000};
	
	int noOfTransaction=0;
	
	public synchronized void transfer (int fromAccount, int toAccount, double amount){
		
		if(accounts[fromAccount]<amount)
			return;
		
		accounts[fromAccount] = accounts[fromAccount] - amount;
		accounts[toAccount] = accounts[toAccount] + amount;
		noOfTransaction++;
		
		
		if(noOfTransaction % 1000 == 0)
			totalAccount();
		
	}
	
	
	public void totalAccount(){
		double total =0;
		
		for(int i=0; i<10; i++){
			total+=accounts[i];
			
		}
		System.out.println("Total is:" + total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		
		for(int i=0;i<10;i++){
			TransferThread t = new TransferThread(b, i, 100);
			t.start();
		}

	}

}
