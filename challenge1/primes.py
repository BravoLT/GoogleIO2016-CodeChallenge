#!/usr/bin/env python

def primes(n):
	for i in range(2,n+1):
		if is_prime(i):
			print i, 
def is_prime(n):
	for i in range(2, n):
		if n % i == 0:
			return False
	return True

if __name__ == '__main__':
	primes(101)