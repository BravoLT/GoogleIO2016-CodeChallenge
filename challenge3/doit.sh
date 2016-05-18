#!/bin/sh

do_it()
{
  cat $1 | awk '{
	  word_count = split($0, words, "   ")

      for(i = 1; i <= word_count; i++) {
        letter_count = split(words[i], letters, " ")

        for(j = 1; j <= letter_count; j++) {
          if (".-" == letters[j])
            printf "A"
          else if ("-..." == letters[j])
            printf "B"
          else if ("-.-." == letters[j])
            printf "C"
          else if ("-.." == letters[j])
            printf "D"
          else if ("." == letters[j])
            printf "E"
          else if ("..-." == letters[j])
            printf "F"
          else if ("--." == letters[j])
            printf "G"
          else if ("...." == letters[j])
            printf "H"
          else if (".." == letters[j])
            printf "I"
          else if (".---" == letters[j])
            printf "J"
          else if ("-.-" == letters[j])
            printf "K"
          else if (".-.." == letters[j])
            printf "L"
          else if ("--" == letters[j])
            printf "M"
          else if ("-." == letters[j])
            printf "N"
          else if ("---" == letters[j])
            printf "O"
          else if (".--." == letters[j])
            printf "P"
          else if ("--.-" == letters[j])
            printf "Q"
          else if (".-." == letters[j])
            printf "R"
          else if ("..." == letters[j])
            printf "S"
          else if ("-" == letters[j])
            printf "T"
          else if ("..-" == letters[j])
            printf "U"
          else if ("...-" == letters[j])
            printf "V"
          else if (".--" == letters[j])
            printf "W"
          else if ("-..-" == letters[j])
            printf "X"
          else if ("-.--" == letters[j])
            printf "Y"
          else if ("--.." == letters[j])
            printf "Z"
          else if (".-.-.-" == letters[j])
            printf "."
          else if ("--..--" == letters[j])
            printf ","
          else if ("..--.." == letters[j])
            printf "?"
          else if ("-..-." == letters[j])
            printf "/"
          else if (".--.-." == letters[j])
            printf "@"
          else if (".----" == letters[j])
            printf "1"
          else if ("..---" == letters[j])
            printf "2"
          else if ("...--" == letters[j])
            printf "3"
          else if ("....-" == letters[j])
            printf "4"
          else if ("....." == letters[j])
            printf "5"
          else if ("-...." == letters[j])
            printf "6"
          else if ("--..." == letters[j])
            printf "7"
          else if ("---.." == letters[j])
            printf "8"
          else if ("----." == letters[j])
            printf "9"
          else if ("-----" == letters[j])
            printf "0"
          else
            printf letters[j]
        }

        printf " "
      }

      print ""
    }'
}

do_it "challenge3_sample.txt"
