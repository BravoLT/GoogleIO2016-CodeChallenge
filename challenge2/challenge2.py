#!/usr/bin/python
import sys

if len(sys.argv) != 2:
 print("Must include filename using either of the following syntax:\npython challenge2.py [filename]\n./challenge2.py [filename]")
 exit()

letters = [[],['A','B','C'],['D','E','F'],['G','H','I'],['J','K','L'],['M','N','O'],['P','Q','R','S'],['T','U','V'],['W','X','Y','Z']]

f = open (sys.argv[1], 'r')
for line in f:
 line = line.strip()
 words = line.split()
 for n in range(0,len(words)):
  chs = words[n].split('.')
  for t in range(0,len(chs)):
   chs[t] = letters[int(chs[t][0])-1][len(chs[t])-1]
  words[n] = "".join(chs)
 line = " ".join(words)
 print(line)
