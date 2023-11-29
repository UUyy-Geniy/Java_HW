package HW8;

public class MyClass {
    private String name;
    private int age;
    public MyClass(String name_, int age_)
    {
        name = name_;
        age= age_;
    }
    public void print()
    {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
