package warmup;

import java.util.HashSet;
import java.util.Set;



public class Quadratic {

    /**
     * Find the integer roots of a quadratic equation, ax^2 + bx + c = 0.
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term.  Requires that a, b, and c are not ALL zero.
     * @return all integers x such that ax^2 + bx + c = 0.
     */
	public static Set<Integer> roots(int a, int b, int c) {
		int i = 10;
		Set<Integer> roots = new HashSet<Integer>();
		double root1;
        double root2;
        double d = Math.pow(b, 2) - 4 * a * c;
		if((b < 0 && c > 0) || (b < 0 && c == 0) || (b == 0 && c == 0) || (b > 0 && c >0)) {
			//System.out.println("d = " +  d);
        	root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
        	root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
        	roots.add((int)root1);
        	roots.add((int)root2);
        	//System.out.println(roots);
			return roots;
		}
		if((a < 0 && b > 0 && c < 0)) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			root1 = (b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
			System.out.println(root1);
			return roots;
		}
		else {
			return roots;
		}
	}
	
	/*
	public static Set<Integer> roots(int a, int b, int c) {
		int i = 10;
		Set<Integer> roots = new HashSet<Integer>();
		double root1;
        double root2;
        double d = Math.pow(b, 2) - 4 * a * c;
		if(d == 0) {
			System.out.println("when d == 0, a = " + a);
        	System.out.println("when d == 0, b = " + b);
        	System.out.println("when d == 0, c = " + c);
        	
        	System.out.println();
			return roots;
		}
		else if(d < 0) {
			System.out.println("when d < 0, a = " + a);
        	System.out.println("when d < 0, b = " + b);
        	System.out.println("when d < 0, c = " + c);
        	System.out.println();
			return roots;
		}
		else if(d > 0) {
			System.out.println("when d > 0, a = " + a);
        	System.out.println("when d > 0, b = " + b);
        	System.out.println("when d > 0, c = " + c);
        	root1 = -b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a;
        	root2 = -b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a;
        	roots.add((int)root1);
        	roots.add((int)root2);
        	System.out.println("roots = " + roots);
        	System.out.println();
			return roots;
		}
		else {
			return roots;
		}
	}
	
	
    public static Set<Integer> roots(int a, int b, int c) {
        Set<Integer> roots = new HashSet<Integer>();
        double root1;
        double root2;
        double d = Math.pow(b, 2) - 4 * a * c;
        if(d == 0) {
        	System.out.println("when d == 0, a = " + a);
        	System.out.println("when d == 0, b = " + b);
        	System.out.println("when d == 0, c = " + c);
        	System.out.println();
        }
        else if(d < 0) {
        	System.out.println("when d < 0, a = " + a);
        	System.out.println("when d < 0, b = " + b);
        	System.out.println("when d < 0, c = " + c);
        	System.out.println();
        }
        else if(d > 0) {
        	System.out.println("when d > 0, a = " + a);
        	System.out.println("when d > 0, b = " + b);
        	System.out.println("when d > 0, c = " + c);
        	System.out.println();
        	}
        else {
        	return roots;
        }
        //return roots;
      	}*/

    
    /**
     * Main function of program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("For the equation x^2 - 4x + 3 = 0, the possible solutions are:");
        Set<Integer> result = roots(1, -4, 3);
        System.out.println(result);
    }

    /* Copyright (c) 2016 MIT 6.005 course staff, all rights reserved.
     * Redistribution of original or derived work requires explicit permission.
     * Don't post any of this code on the web or to a public Github repository.
     */
}
