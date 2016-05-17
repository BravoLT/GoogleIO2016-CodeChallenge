#!/usr/bin/python
# coding: utf-8
import sys

if len(sys.argv) != 2:
 print("Must include filename using either of the following syntax:\npython challenge2.py [filename]\n./challenge2.py [filename]")
 exit()

letters = {'root':['T','E'],'T':['M','N'],'M':['O','G'],'O':['CH','Ö'],'CH':['0','9'],'Ö':['','8'],'8':['',':'],'G':['Q','Z'],'Q':['Ñ','Ĝ'],'Z':['blank1','7'],'blank1':[',',''],'N':['K','D'],'K':['Y','C'],'Y':['','Ĥ'],'Ĥ':['()',''],'C':['blank2','Ç'],'blank2':['!',';'],'D':['X','B'],'X':['','/'],'B':['=','6'],'6':['-',''],'E':['A','I'],'A':['W','R'],'W':['J','P'],'J':['1','Ĵ'],'1':['','\''],'P':['À','Þ'],'À':['','@'],'R':['Ä','L'],'Ä':['','+'],'+':['.',''],'L':['È',''],'È':['','"'],'I':['U','S'],'U':['Ü','F'],'Ü':['2','Đ'],'Đ':['_','?'],'F':['','É'],'S':['V','H'],'V':['3','Ŝ'],'H':['4','5']}

def getLetter(ch,letter):
 if len(ch)==0:
  if letter=='root':
   return ' '
  elif len(letter) == 0 or letter.startswith('blank'):
   return '#'
  return letter
 else:
  if ch[0]=='-':
   return getLetter(ch[1:],letters[letter][0])
  elif ch[0]=='.':
   return getLetter(ch[1:],letters[letter][1])
  else:
   return '#'



f = open (sys.argv[1], 'r')
for line in f:
 line = line.strip()
 words = line.split("   ")
 for n in range(0,len(words)):
  chs = words[n].split(' ')
  for t in range(0,len(chs)):
   chs[t]=getLetter(chs[t],'root')
  words[n] = "".join(chs)
 line = " ".join(words)
 print(line)
