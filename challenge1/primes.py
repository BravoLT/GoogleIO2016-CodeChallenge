primes = []

for num in range(2, 102):
    print "checking " + str(num)
    for i in range(2,num):
        if (num % i) == 0:
            print str(num) + " not prime"
            break
    else:
        print "adding " + str(num) + " to list"
        primes.append(num)


print primes