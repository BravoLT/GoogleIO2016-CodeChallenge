#!/usr/bin/python
for n in range(2, 102):
  for x in range(2, n):
    if n % x == 0:
      break
  else:
    print(n)
