#!/usr/bin/env python 
import sys

alphabet = {
	".-" : "A" ,
	"-..." : "B" ,
	"-.-." : "C" ,
	"-.." : "D" ,
	"." : "E" ,
	"..-." : "F" ,
	"--." : "G" ,
	"...." : "H" ,
	".." : "I" ,
	".---" : "J" ,
	"-.-" : "K" ,
	".-.." : "L" ,
	"--" : "M" ,
	"-." : "N" ,
	"---" : "O" ,
	".--." : "P" ,
	"--.-" : "Q" ,
	".-." : "R" ,
	"..." : "S" ,
	"-" : "T" ,
	"..-" : "U" ,
	"...-" : "V" ,
	".--" : "W" ,
	"-..-" : "X" ,
	"-.--" : "Y" ,
	"--.." : "Z"
}

with open(sys.argv[1], 'rb') as input_file:
	coded_message = input_file.read()

decoded_message = ''

for word in coded_message.split('   '):
	for letter in word.split():
		decoded_message += alphabet[letter]
	decoded_message += ' '

print decoded_message