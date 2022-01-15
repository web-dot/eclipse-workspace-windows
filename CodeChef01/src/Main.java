import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	//ATM
	public static void main(String[] args)throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String[] var = reader.readLine().split(" ");
	int withdrawl = Integer.parseInt(var[0]);
	float balance = Float.parseFloat(var[1]);
	if(withdrawl % 5 == 0 && balance > (withdrawl+0.5)) {
		balance = (float)(balance - (withdrawl + 0.5));
		System.out.println(balance);
		
	}
	else {
		System.out.println(balance);
	}

	}

}
