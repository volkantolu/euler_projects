package functor;

public class IntComparator implements Comparator
{
    public int compare(Number a, Number b)
    {
        int x = a.intValue();
        int y = b.intValue();
        if (x < y) return -1;
        else if (x > y) return 1;
        else return 0;
    }
}