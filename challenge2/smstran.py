#!/usr/bin/env python2
def numtable(smscode):
    smsstr = str(smscode)
    smschar = smsstr[0]
    smscount = len(smsstr)
    if int(smschar) != 7 and smscount > 3:
        if smscount % 3 == 0:
            smscount = 3
        else:
            smscount = smscount % 3
    elif int(smschar) == 7 and smscount > 4:
        if smscount % 4 == 0:
            smscount = 4
        else:
            smscount = smscount % 4
    transdict = {
        (2,1): 'A',
        (2,2): 'B',
        (2,3): 'C',
        (3,1): 'D',
        (3,2): 'E',
        (3,3): 'F',
        (4,1): 'G',
        (4,2): 'H',
        (4,3): 'I',
        (5,1): 'J',
        (5,2): 'K',
        (5,3): 'L',
        (6,1): 'M',
        (6,2): 'N',
        (6,3): 'O',
        (7,1): 'P',
        (7,2): 'Q',
        (7,3): 'R',
        (7,4): 'S',
        (8,1): 'T',
        (8,2): 'U',
        (8,3): 'V',
        (9,1): 'X',
        (9,2): 'Y',
        (9,3): 'Z'
    }
    return transdict.get((int(smschar), smscount))

def smsread(smsfile):
    f = open(smsfile, 'r')
    words = str(f.read()).split(' ')
    decode = ''
    for word in words:
        chars = word.split('.')
        for char in chars:
            decode += numtable(char)
        decode += ' '
    return decode.strip()
    
print smsread('challenge2_sample.txt')
