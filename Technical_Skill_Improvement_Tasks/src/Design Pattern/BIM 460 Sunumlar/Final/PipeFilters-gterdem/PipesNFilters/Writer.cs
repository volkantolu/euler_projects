using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{
    //Writing Filter as an output
    public class Writer : IOperation<string>
    {
        public IEnumerable<string> Execute(IEnumerable<string> input)
        {
            foreach (string line in input)
            {
                Console.WriteLine();
                Console.WriteLine(line);
            }
            Console.ReadLine();
            //avoiding to return any result
            yield break;
        }
    }
}
