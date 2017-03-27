using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{
    //The Shifter filter is where the main logic of the KWIC application is implemented. 
    //It shifts the words in each line to find all the possible permutations suitable 
    //for the index.
    public class Shifter : IOperation<string>
    {
        public IEnumerable<string> Execute(IEnumerable<string> input)
        {
            List<string> shifts = new List<string>();
            foreach (string line in input)
            {
                string[] words = line.Split(new char[] { ' ' });
                for (int i = 0; i <= words.Length - 1; i++)
                {
                    shifts.Add(string.Join(" ", words));
                    string firstWord = words[0];
                    //Swapping words
                    for (int j = 1; j <= words.Length - 1; j++)
                    {
                        words.SetValue(words[j], j - 1);
                    }
                    words.SetValue(firstWord, words.Length - 1);
                }
            }
            return shifts;
        }
    }
}
