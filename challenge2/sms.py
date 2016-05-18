#!/usr/bin/env python
import sys

keyboard = ['','','ABC','DEF','GHI','JKL','MNO','PQRS', 'TUV','WXYZ']

with open(sys.argv[1], 'rb') as in_file:
	coded_message = in_file.read()

decoded_message = ''
for word in coded_message.split():
	for letter in word.split('.'):
		num_presses = len(letter)-1
		key = int(letter[0])
		decoded_message += keyboard[key][num_presses]
	decoded_message += ' '

print decoded_message