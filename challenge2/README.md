# Challenge 2

Requires any recent version of Ruby, on Windows, Mac OSX, or Linux. (I happen to be using Bash on Ubuntu on Windows, with Ruby 1.9.3p484)

> ruby challenge2.rb

This will, by default, load the challenge2_sample.txt provided. (NOTE: This assumes you are already in the challenge2 directory -- the file path is relative.)

You can also pass in an specific file to convert by using an explicit filename, such as :

> ruby challenge2.rb challenge2_sample.txt


# Back in my day we could spell CAB with 1 key

![Back in my day](https://s-media-cache-ak0.pinimg.com/originals/be/51/80/be518073df662a5154137af45052985f.jpg)

SMS messaging wasn’t always as easy as a swipe over a qwerty keyboard.  There were physical buttons and you pressed a number several times to get a letter.  For example, 2 = A, 22=B, 222=C.  For 2 entries, write a program that can translate a file containing numbers in the above notation to the text representation.  Letters will use a “.” to separate characters.  Words are separated by whitespace  For example:

```
222.2.8 = CAT
3.666.4 = DOG
22.777.2.888.666 55.8 = BRAVO LT
```

For those of you who do not have a phone with letters associated to numbers, the following layout should be used:
```
|  1  |  2  |  3  |
|     | ABC | DEF |
-------------------
|  4  |  5  |  6  |
| GHI | JKL | MNO |
-------------------
|  7  |  8  |  9  |
|PQRS | TUV |WXYZ |
```
