using System;
using System.IO;

namespace challenge2
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            string input = File.ReadAllText("challenge2_sample.txt").TrimEnd('\r', '\n');
            string[] words = input.Split(' ');

            foreach (string word in words)
            {
                string[] letters = word.Split('.');
                foreach (string letter in letters)
                {
                    switch (letter)
                    {
                        case "2": Console.Write("A"); break;
                        case "22": Console.Write("B"); break;
                        case "222": Console.Write("C"); break;
                        case "3": Console.Write("D"); break;
                        case "33": Console.Write("E"); break;
                        case "333": Console.Write("F"); break;
                        case "4": Console.Write("G"); break;
                        case "44": Console.Write("H"); break;
                        case "444": Console.Write("I"); break;
                        case "5": Console.Write("J"); break;
                        case "55": Console.Write("K"); break;
                        case "555": Console.Write("L"); break;
                        case "6": Console.Write("M"); break;
                        case "66": Console.Write("N"); break;
                        case "666": Console.Write("O"); break;
                        case "7": Console.Write("P"); break;
                        case "77": Console.Write("Q"); break;
                        case "777": Console.Write("R"); break;
                        case "7777": Console.Write("S"); break;
                        case "8": Console.Write("T"); break;
                        case "88": Console.Write("U"); break;
                        case "888": Console.Write("V"); break;
                        case "9": Console.Write("W"); break;
                        case "99": Console.Write("X"); break;
                        case "999": Console.Write("Y"); break;
                        case "9989": Console.Write("Z"); break;
                    }
                }

                Console.Write(" ");
            }

            Console.WriteLine();
            Console.WriteLine("Press ENTER to end.");
            Console.ReadLine();
        }
    }
}