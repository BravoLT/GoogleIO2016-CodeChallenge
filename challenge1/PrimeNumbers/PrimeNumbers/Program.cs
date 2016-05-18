namespace PrimeNumbers
{
    using System;

    class Program
    {
        /// <summary>
        /// Mains the specified arguments.
        /// </summary>
        /// <param name="args">The arguments.</param>
        static void Main(string[] args)
        {
           for(var x = 0; x <= 101; x++)
            {
                bool primeNumber = IsPrime(x);

                if (primeNumber)
                {
                    Console.WriteLine($"{x} is a Prime Number!!");
                }
            }
            Console.ReadKey();
        }


        /// <summary>
        /// Determines whether the specified candidate is prime.
        /// </summary>
        /// <param name="prime">.</param>
        /// <returns></returns>
        public static bool IsPrime(int prime)
        {
            if ((prime & 1) == 0)
            {
                if (prime == 2)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            for (int i = 3; (i * i) <= prime; i += 2)
            {
                if ((prime % i) == 0)
                {
                    return false;
                }
            }
            return prime != 1;
        }
    }
}
