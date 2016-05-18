using System;

namespace challenge1
{
    internal class Program
    {
        private static bool IsPrime(int number)
        {
            if (number % 2 == 0)
                return false;

            for (int i = 3; i * i <= number; i += 2)
                if (number % i == 0)
                    return false;

            return true;
        }

        private static void Main(string[] args)
        {
            for (int i = 1; i <= 101; i++)
            {
                if (i == 2)
                    Console.WriteLine("2. Prime: True (and the only even prime number)");
                else
                    Console.WriteLine($"{i}. Prime: {IsPrime(i)}");
            }

            Console.WriteLine("Press ENTER to exit.");
            Console.ReadLine();
        }
    }
}