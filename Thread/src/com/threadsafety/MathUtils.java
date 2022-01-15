package com.threadsafety;
import java.math.*;

public class MathUtils {
	
	//stateless deterministic class -> thread safe
	public static BigInteger factorial(int number) {
		BigInteger f = new BigInteger("1");
		for(int i = 0; i <= number; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
}


