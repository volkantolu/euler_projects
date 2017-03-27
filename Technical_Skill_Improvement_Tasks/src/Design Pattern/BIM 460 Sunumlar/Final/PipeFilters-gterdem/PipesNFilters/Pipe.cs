using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PipesNFilters
{
    //Pipe class for transfering data
    //Pipe registers filters (in here operations)
    //and executes them simultaniously
    public class Pipe<T>
    {
        private readonly List<IOperation<T>> operations = new List<IOperation<T>>();

        public Pipe<T> Register(IOperation<T> operation)
        {
            operations.Add(operation);
            return this;
        }

        public void Execute()
        {
            IEnumerable<T> current = new List<T>();
            foreach (IOperation<T> operation in operations)
            {
                current = operation.Execute(current);
            }
            IEnumerator<T> enumerator = current.GetEnumerator();
            while (enumerator.MoveNext()) ;
        }
    }
}
