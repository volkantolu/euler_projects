using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace PipesNFilters
{
    //The Reader filter reads the input text from a file and returns an IEnumerable 
    //list of lines. 
    
    public class Reader:IOperation<string>
    {
        public IEnumerable<string> Execute(IEnumerable<string> input)
        {
            Console.Title = "Pipes and Filters Pattern Sample";
            Console.Write("Enter the Path of the File\n");
            //StreamReader s = new StreamReader();
            //return s.ReadLine();
            //return s.ReadLine(Console.ReadLine());
            return File.ReadAllLines(Console.ReadLine());
        }
    }
}
