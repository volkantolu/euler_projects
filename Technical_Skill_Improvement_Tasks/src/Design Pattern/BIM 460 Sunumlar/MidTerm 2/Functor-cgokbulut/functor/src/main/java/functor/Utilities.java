package functor;

public class Utilities
{
    public static int compareNumbers(Number a, Number b,Comparator c)
    {
        return c.compare(a, b);
    }
}