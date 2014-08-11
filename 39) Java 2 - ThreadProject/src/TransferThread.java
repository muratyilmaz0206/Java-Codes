
public class TransferThread extends Thread{

	/**
	 * @param args
	 */
	Bank bank;
	int from;
	double max;
	
	
	TransferThread(Bank B, int fromAccount, int maxAmount){
	bank = B;
	from = fromAccount;
	max = maxAmount;
	}
	
	public void run(){
		try{
		while(!interrupted()){
			// random number between 0 and 10
			int toAccount =(int)( Math.random() *10);
			// amount between 0 and max
			double amount = max * Math.random();
			bank.transfer(from, toAccount, amount);
			sleep(1);
			
		}
		}catch(Exception ee){
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
