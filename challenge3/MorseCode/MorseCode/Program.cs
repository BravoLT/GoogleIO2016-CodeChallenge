using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MorseCode
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Text;

    class Program
    {
        /// <summary>
        /// The delimiter char1
        /// </summary>
        public static char[] delimiterChar1 = { ' ',' ',' ' };
        /// <summary>
        /// The delimiter char2
        /// </summary>
        public static char[] delimiterChar2 = { ' ' };
        /// <summary>
        /// The words array
        /// </summary>
        public static List<string> wordsArray = new List<string>();

        /// <summary>
        /// Mains the specified arguments.
        /// </summary>
        /// <param name="args">The arguments.</param>
        static void Main(string[] args)
        {
            string message = loadFile();
            string[] words = message.Split(delimiterChar1);

            foreach (var word in words)
            {
                string[] letters = word.Split(delimiterChar2);
                StringBuilder builder = new StringBuilder();

                foreach (var letter in letters)
                {
                    string realLetter = keys.FirstOrDefault(x => x.Value == letter).Key.ToString(); // keys[Convert.ToChar(letter)];
                    builder.Append(realLetter);
                }

                wordsArray.Add(builder.ToString());
            }

            StringBuilder finalBuilder = new StringBuilder();

            foreach (var word in wordsArray)
            {
                finalBuilder.Append(word);
            }

            Console.Write(finalBuilder.ToString());
            Console.ReadKey();
        }

        /// <summary>
        /// Loads the file.
        /// </summary>
        /// <returns></returns>
        public static string loadFile()
        {
            string text;
            string nicetext;
            var fileStream = new FileStream(@"../../../../challenge3_sample.txt", FileMode.Open, FileAccess.Read);
            using (var streamReader = new StreamReader(fileStream, Encoding.UTF8))
            {
                text = streamReader.ReadToEnd();
                nicetext = text.Replace(System.Environment.NewLine, string.Empty);

            }
            return nicetext;
        }

        /// <summary>
        /// Loads the keys.
        /// </summary>
        /// <returns></returns>
       public static Dictionary<char, string> keys = new Dictionary<char, string>
  {
    {'A', ".-"},
    {'B', "-..."},
    {'C', "-.-."},
    {'D', "-.."},
    {'E', "."},
    {'F', "..-."},
    {'G', "--."},
    {'H', "...."},
    {'I', ".."},
    {'J', ".---"},
    {'K', "-.-"},
    {'L', ".-.."},
    {'M', "--"},
    {'N', "-."},
    {'O', "---"},
    {'P', ".--."},
    {'Q', "--.-"},
    {'R', ".-."},
    {'S', "..."},
    {'T', "-"},
    {'U', "..-"},
    {'V', "...-"},
    {'W', ".--"},
    {'X', "-..-"},
    {'Y', "-.--"},
    {'Z', "--.."}
  };
    }
}
