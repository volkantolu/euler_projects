using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{
    //Main program
    public class Program
    {      
        static void Main(string[] args)
        {
            Pipeline pipeline = new Pipeline();
            pipeline.Execute();
        }
    }
}
