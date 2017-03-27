using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{
    //Line comparing class 
    public class LineCompare : IComparer<string>
    {
        public int Compare(string a, string b)
        {
            return string.Compare(a, b);
        }
    }
}
