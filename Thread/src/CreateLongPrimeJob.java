
public class CreateLongPrimeJob implements Runnable{
	private int minPrime;
	private int longPrime;
	CreateLongPrimeJob(int minPrime){
		this.minPrime = minPrime;
	}
	public int getLongPrime() {
		return longPrime;
	}
	public boolean getPrime(int val) {
		if(val == 1 && val == 0) {
			return false;
		}
		if((val & 1) == 0) {
			return false;
		}
		if(val < 0) {
			return false;
		}
		if(val == 2) {
			return true;
		}
		for(int i = 3; i < (int)(Math.sqrt(val) + 1); i+=2) {
			if(val % i == 0) {
				return false;
			}
		}
		return true;
	}
	public void run() {
		int inVal = (int)(Math.random() * minPrime);
		while(true) {
			if(getPrime(inVal)) {
				longPrime = inVal;
				System.out.println(longPrime);
				break;
			}
		}
	}
}
