package mt2.functor.ex1;

public class Utilities
{
    public static int compareNumbers(Number a, Number b,Comparator c)
    {
        return c.compare(a, b);
    }
}