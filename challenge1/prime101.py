#!/usr/bin/env python2

for i in range(102):
    count = 0
    for f in range(1,10):
        if i % f == 0:
            if i != f:
                count += 1
    if count < 2:
        print i
