package lab17primes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lab17Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scnr = new Scanner(System.in);
	int primeRequest = 0, prime = 0;
	String cont = "n";
	
	System.out.println("Let's locate some primes!");
	System.out.println("This application will find you any prime, in order, from first prime number on.");
	
	do {
	System.out.println("Which prime are you looking for?");
	
	primeRequest = scnr.nextInt();

	
	prime = getNthPrime(primeRequest);
	
	System.out.println("The number " + primeRequest + " prime is " + prime + ".");
	
	
	System.out.println("Do you want to find another prime number?(y/n):");
	cont = scnr.next();
	} while (cont.equals("y"));
	
	System.out.println("GoodBye!");
	}
	public static boolean isPrime(int num) {
		int n = num;
			   //check if n is a multiple of 2
			   if (n%2==0) return false;
			   //if not, then just check the odds
			   for(int i=3;i*i<=n;i+=2) {
			       if(n%i==0)
			           return false;
			   }
			   return true;
			}
	

	public static int getNthPrime(int requestNum) {
		
		int i = 0;
		int count = 1;
		int testNum = 2;
		
		while (count < requestNum) {
			testNum++;
			if (isPrime(testNum)) {
				count++;
			}
	}
		return testNum;
	}
}
