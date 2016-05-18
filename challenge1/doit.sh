#!/bin/bash

PRIMES=""

for i in {1..101}; do
  if [ $i -gt 1 ]; then
	p=1

    for j in $PRIMES; do
	  if [ $j -eq 1 ]; then
        continue
      fi

      if [ `expr $i % $j` -eq 0 ]; then
        p=0
        break
      fi
	done

	if [ $p -eq 1 ]; then
      PRIMES="$PRIMES $i"
	fi
  fi
done

echo $PRIMES