package HW10;

public class HW10 {
    public static void print(Triple<?> instance)
    {
        try
        {
            System.out.println("Min: " + instance.min());
            System.out.println("Max: " + instance.max());
            System.out.println("Mean: " + instance.mean());
        }
        catch (RuntimeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {

        Triple<Integer> inst1 = new Triple<>(2, 2, 5);
        inst1.setSecond(12);
        print(inst1);

        Triple<String> inst2 = new Triple<>("a", "b", "C");
        inst2.setFirst("F");
        print(inst2);
    }
}
