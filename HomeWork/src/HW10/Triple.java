package HW10;

public class Triple<T>{
    private T first;
    private T second;
    private T third;
    public Triple(T first_, T second_, T third_)
    {
        first = first_;
        second = second_;
        third = third_;
    }
    public T getFirst()
    {
        return this.first;
    }
    public T getSecond()
    {
        return this.second;
    }
    public T getThird()
    {
        return this.third;
    }
    public void setFirst(T first)
    {
        this.first = first;
    }

    public void setSecond(T second)
    {
        this.second = second;
    }

    public void setThird(T third)
    {
        this.third = third;
    }

    public T min()
    {
        if (first instanceof Comparable)
        {
            T min = first;
            if (((Comparable)second).compareTo(min) < 0)
                min = second;
            if (((Comparable) third).compareTo(min) < 0)
                min = third;
            return min;
        }
        else
            throw new RuntimeException("Impossible to calculate min");

    }
    public T max()
    {
        if (first instanceof Comparable)
        {
            T max = first;
            if (((Comparable)second).compareTo(max) > 0)
                max = second;
            if (((Comparable)third).compareTo(max) > 0)
                max = third;
            return max;
        }
        else
            throw new RuntimeException("Impossible to calculate max");

    }

    public double mean()
    {
        if (first instanceof Number)
        {
            return (((Number) first).doubleValue() +
                    ((Number)second).doubleValue() +
                    ((Number)(third)).doubleValue())/3;
        }
        else
            throw new RuntimeException("Impossible to calculate mean");

    }
}
