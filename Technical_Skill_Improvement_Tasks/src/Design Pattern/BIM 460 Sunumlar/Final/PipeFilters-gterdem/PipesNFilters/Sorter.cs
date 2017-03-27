using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{
    //Sorting Filter
    public class Sorter : IOperation<string>
    {
        public IEnumerable<string> Execute(IEnumerable<string> input)
        {
            //Defined and LineCompare class
            LineCompare lineCompare = new LineCompare();
            input.ToList<string>().Sort(lineCompare);
            return input;
        }
    }
}
