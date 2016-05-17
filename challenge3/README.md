# You mean there's a system for this?

![Morse Code Rocks](http://cdn.quotesgram.com/img/99/45/123144686-morse_code-34999.gif)

As you may or may not know Samuel Morse, a portrait painter by trade, helped invent the electrical telegraph and the associated means of sending signals, Morse Code.  For most of us today, learning Morse seems like a daunting task.  Fortunately, there is a system behind it.  [Morse code is built around a binary tree](http://www.learnmorsecode.com/), so if you know how the tree works, you too can understand Morse code.  However, we’re programmers and, well, listening and writing it all out sounds like a lot of work.  So let’s make the computer do it!

Write a program that reads morse code in a file and translate the message.  Words are delimited by 3 spaces.  Characters are delimited by a single space. Ideally your solution will use the tree to decode the message.  For example:

-... .-. .- …- ---   .-.. - = BRAVO LT
