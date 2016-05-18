namespace ConsoleApplication1
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
        public static char[] delimiterChar1 = { ' ' };
        /// <summary>
        /// The delimiter char2
        /// </summary>
        public static char[] delimiterChar2 = { '.' };
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
            Dictionary<string, string> keys = loadKeys();

            foreach(var word in words)
            {
                string[] letters = word.Split(delimiterChar2);
                StringBuilder builder = new StringBuilder();

                foreach (var letter in letters)
                {
                     string realLetter = keys[letter.ToString()];
                    builder.Append(realLetter);
                }

                wordsArray.Add(builder.ToString());
            }

            StringBuilder finalBuilder = new StringBuilder();

            foreach(var word in wordsArray)
            {
                finalBuilder.Append(word).Append(" ");
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
            var fileStream = new FileStream(@"../../../../challenge2_sample.txt", FileMode.Open, FileAccess.Read);
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
        public static Dictionary<string, string> loadKeys()
        {
            Dictionary<string, string> keys = new Dictionary<string, string>();

            keys.Add("2", "a");
            keys.Add("22", "b");
            keys.Add("222", "c");
            keys.Add("3", "d");
            keys.Add("33", "e");
            keys.Add("333", "f");
            keys.Add("4", "g");
            keys.Add("44", "h");
            keys.Add("444", "i");
            keys.Add("5", "j");
            keys.Add("55", "k");
            keys.Add("555", "l");
            keys.Add("6", "m");
            keys.Add("66", "n");
            keys.Add("666", "o");
            keys.Add("7", "p");
            keys.Add("77", "q");
            keys.Add("777", "r");
            keys.Add("7777", "s");
            keys.Add("8", "t");
            keys.Add("88", "u");
            keys.Add("888", "v");
            keys.Add("9", "w");
            keys.Add("99", "x");
            keys.Add("999", "y");
            keys.Add("9999", "z");

            return keys;
        }
    }
}
