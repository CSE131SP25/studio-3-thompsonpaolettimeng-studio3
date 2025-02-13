package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a number, n:");
		int n = in.nextInt();
		int i = 2;
		int f = 2;
		boolean primeNum[] = new boolean [n];
		primeNum[0] = true;
		primeNum[1] = true;
		while(f <= n) {
		for (f = 2*2;f < n;f += 2) {
			primeNum[f] = true;
		}
		if((f % i) == 0) {
		primeNum[f] = true;
		}
	}
}
}