package HW9;
import java.lang.reflect.*;

public class HW9 {
    public static void main(String[] args) {
        try
        {
            MyClass me = new MyClass("Evgeniy", 20);
            String className = me.getClass().getName();
            System.out.println("Class name: "
                    + className);
            Class<?> instance = Class.forName(className);
            Constructor<?> constructor = instance.getConstructor(String.class, int.class);
            Object copyOfMe = constructor.newInstance("Vova", 35);

            String methodName1 = "setAge";
            String methodName2 = "print";

            Method method = instance.getMethod(methodName1, int.class);
            method.invoke(copyOfMe, 5);
            method = instance.getMethod(methodName2);
            method.invoke(copyOfMe);
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("Class not found: " + e.getMessage());
        }
        catch (NoSuchMethodException e)
        {
            System.err.println("Method not found: " + e.getMessage());
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException e)
        {
            System.err.println("Error with creating: " + e.getMessage());
        }
    }
}
