package lab17primes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab17primesTest {

	// Proposed Test Cases
	// Submit 1 and get 2 back
	// Submit 2 and get 3 back
	// Submit 3 and get 5 back
    // Submit 7.0 and get 17 back
	// Assume int > 0
	// submit 0 and get please select number > 0
	// Submit -1 and get please select number > 0
	// Submit one and get please select a valid integer > 0
	
	int result = 0;
	
	@Test
	void test1() {
		result = Lab17Primes.getNthPrime(1);
		assertEquals(2, result);
	}

	@Test
	void test2() {
		result = Lab17Primes.getNthPrime(2);
		assertEquals(3, result);
	}
	
	@Test
	void test3() {
		result = Lab17Primes.getNthPrime(3);
		assertEquals(5, result);
	}
	
	@Test
	void test4() {
		result = Lab17Primes.getNthPrime(7);
		assertEquals(17, result);
	}
	
	@Test
	void test5() {
		result = Lab17Primes.getNthPrime(100);
		assertEquals(541, result);
	}
}
