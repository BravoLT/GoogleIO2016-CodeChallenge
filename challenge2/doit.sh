#!/bin/sh

do_it()
{
  cat $1 |
    awk \
      '{gsub(/222/,"C")};{gsub(/22/,"B")};{gsub(/2/,"A")}; \
       {gsub(/333/,"F")};{gsub(/33/,"E")};{gsub(/3/,"D")}; \
       {gsub(/444/,"I")};{gsub(/44/,"H")};{gsub(/4/,"G")}; \
       {gsub(/555/,"L")};{gsub(/55/,"K")};{gsub(/5/,"J")}; \
       {gsub(/666/,"O")};{gsub(/66/,"N")};{gsub(/6/,"M")}; \
       {gsub(/7777/,"S")};{gsub(/777/,"R")};{gsub(/77/,"Q")};{gsub(/7/,"P")}; \
       {gsub(/888/,"V")};{gsub(/88/,"U")};{gsub(/8/,"T")}; \
       {gsub(/9999/,"Z")};{gsub(/999/,"Y")};{gsub(/99/,"X")};{gsub(/9/,"W")}; \
       {gsub(/\./,"")};1'
}

do_it "challenge2_sample.txt"
