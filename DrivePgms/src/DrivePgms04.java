import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrivePgms04 {
	
	//FIND LCM
	public static int findLCM(int a, int b) {
		int lcm = a * b;
		for(int i = a * b; i > 0; i--) {
			if(i % a == 0 && i % b == 0) {
				lcm = i;
			}
		}
		return lcm;
	}
	
	
	//FIND HCF
	public static int findHCF(int a, int b) {
		int hcf = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}
	
	//SWAP NUMBERS WITHOUT TEMP
	public static void swap(int a, int b) {
		a = (int)(a ^ b);
		b = (int)(a ^ b);
		a = (int)(a ^ b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void main(String[] args) throws IOException{
		
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] sa = input.split(" ");
		int num1 = Integer.parseInt(sa[0]);
		int num2 = Integer.parseInt(sa[1]);
		
		//int r = swap(num1, num2);
		swap(num1, num2);
		//System.out.println(r);
	}

}
