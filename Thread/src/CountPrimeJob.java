
public class CountPrimeJob implements Runnable {
	
	int val;
	int primeNumber;
	
	CountPrimeJob(int val){
		this.val = val;
	}
	public long getPrime() {
		return primeNumber;
	}

	@Override
	public void run() {
		while(true)
		{
		int genVal = (int)(Math.random() * val);
		if(checkPrime(genVal)) {
			primeNumber = genVal;
			break;
			}
		}
		//System.out.println(primeNumber);
	}
	
	public static boolean checkPrime(int num) {
		if(num == 0 || num == 1 ) {
			return false;
			}
		if(num < 0 ) {
			return false;
		}
		if(num ==2) {
			return true;
		}
		if((num & 1) == 0) {
			return false;
		}
		for(int i = 3; i < (int)(Math.sqrt(num) + 1); i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}	
}


