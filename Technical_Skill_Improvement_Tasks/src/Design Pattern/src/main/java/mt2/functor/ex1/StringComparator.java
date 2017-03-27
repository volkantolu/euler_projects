package mt2.functor.ex1;

public class StringComparator implements Comparator
{
    public int compare(Number a, Number b)
    {
        String x = a.toString();
        String y = b.toString();
        if (x.compareTo(y) < 0) return -1;
        else if (x.compareTo(y) > 0) return 1;
        else return 0;
    }
}