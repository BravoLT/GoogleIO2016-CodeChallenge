using System;
using System.IO;

namespace challenge3
{
    internal class Program
    {
        private static Node FindLetter(char code, Node tree)
        {
            switch (code)
            {
                case '-':
                    return tree?.DAH;

                case '.':
                    return tree?.DIT;
            }

            return null;
        }

        private static Node GenerateTree()
        {
            return new Node
            {
                DAH = new Node
                {
                    Character = 'T',
                    DAH = new Node
                    {
                        Character = 'M',
                        DAH = new Node
                        {
                            Character = 'O',
                            DAH = new Node
                            {
                                Character = '-',
                                DAH = new Node { Character = '0' },
                                DIT = new Node { Character = '9' }
                            },
                            DIT = new Node
                            {
                                Character = '.',
                                DIT = new Node { Character = '8' }
                            }
                        },
                        DIT = new Node
                        {
                            Character = 'G',
                            DAH = new Node
                            {
                                Character = 'Q'
                            },
                            DIT = new Node
                            {
                                Character = 'Z',
                                DIT = new Node { Character = '7' }
                            }
                        },
                    },
                    DIT = new Node
                    {
                        Character = 'N',
                        DAH = new Node
                        {
                            Character = 'K',
                            DAH = new Node
                            {
                                Character = 'Y'
                            },
                            DIT = new Node
                            {
                                Character = 'C',
                                DIT = new Node { Character = '6' }
                            }
                        },
                        DIT = new Node
                        {
                            Character = 'D',
                            DAH = new Node
                            {
                                Character = 'X'
                            },
                            DIT = new Node
                            {
                                Character = 'B',
                                DIT = new Node { Character = '7' }
                            }
                        },
                    }
                },
                DIT = new Node
                {
                    Character = 'E',
                    DAH = new Node
                    {
                        Character = 'A',
                        DAH = new Node
                        {
                            Character = 'W',
                            DAH = new Node
                            {
                                Character = 'J',
                                DAH = new Node { Character = '1' }
                            },
                            DIT = new Node
                            {
                                Character = 'P'
                            }
                        },
                        DIT = new Node
                        {
                            Character = 'R',
                            DIT = new Node
                            {
                                Character = 'L'
                            }
                        },
                    },
                    DIT = new Node
                    {
                        Character = 'I',
                        DAH = new Node
                        {
                            Character = 'U',
                            DAH = new Node
                            {
                                Character = '_',
                                DAH = new Node { Character = '2' }
                            },
                            DIT = new Node
                            {
                                Character = 'F'
                            }
                        },
                        DIT = new Node
                        {
                            Character = 'S',
                            DAH = new Node
                            {
                                Character = 'V',
                                DAH = new Node { Character = '3' }
                            },
                            DIT = new Node
                            {
                                Character = 'H',
                                DAH = new Node { Character = '4' },
                                DIT = new Node { Character = '5' }
                            }
                        },
                    }
                }
            };
        }

        private static void Main(string[] args)
        {
            string input = File.ReadAllText("challenge3_sample.txt").TrimEnd('\r', '\n');
            string[] words = input.Split(new string[] { "   " }, StringSplitOptions.None);

            var tree = GenerateTree();

            foreach (string word in words)
            {
                string[] letters = word.Split(' ');
                foreach (string letter in letters)
                {
                    Node found = tree;
                    foreach (char code in letter)
                        found = FindLetter(code, found);

                    Console.Write(found?.Character ?? '#');
                }

                Console.Write(" ");
            }

            Console.WriteLine();
            Console.WriteLine("Press ENTER to exit.");
            Console.ReadLine();
        }

        private class Node
        {
            public char Character { get; set; }
            public Node DAH { get; set; }
            public Node DIT { get; set; }
        }
    }
}