using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{    
    public class Pipeline : Pipe<string>
    {
        //Public constructor for registering easly
        public Pipeline()
        {
            Register(new Reader());
            Register(new Shifter());
            Register(new Sorter());
            Register(new Writer());
        }
    }
}
