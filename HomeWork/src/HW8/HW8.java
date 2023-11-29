package HW8;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;

public class HW8 {
    public static void printClassName(Class<?> instance)
    {
        System.out.println("Class name: " + instance.getName());
    }
    public static void printClassModifier(Class<?> instance)
    {
        int mods = instance.getModifiers();
        System.out.print("Class modifier: ");
        if (Modifier.isPublic(mods))
            System.out.print("public");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract");
        if (Modifier.isFinal(mods))
            System.out.print("final");
        System.out.println();
    }

    public static void printEveryConstructor(Constructor<?>[] constructors)
    {
        for (var constructor : constructors)
        {
            System.out.print("Constructor " + constructor.getName() + "(): Fields:");
            Class<?>[] params = constructor.getParameterTypes();
            for (var param : params)
                System.out.print(param.getName() + " | ");
        }
        System.out.println("\n");
    }
    public static void printClassConstructors(Class<?> instance)
    {
        Constructor<?>[] constructors = instance.getConstructors();
        printEveryConstructor(constructors);

        constructors = instance.getDeclaredConstructors();
        printEveryConstructor(constructors);
    }
    public static void printEveryField( Field[] fields)
    {
        for (var field : fields)
        {
            Class<?> fld = field.getType();
            System.out.println("Field name : " + field.getName());
            System.out.println("Field type : " + fld.getName());
        }
        System.out.println();
    }
    public static void printClassFields(Class<?> instance)
    {
        Field[] fields = instance.getFields();
        printEveryField(fields);
        fields = instance.getDeclaredFields();
        printEveryField(fields);
    }
    public static void printEveryMethod(Method[] methods)
    {
        for (var method : methods)
        {
            System.out.println("Method name : " + method.getName());
            System.out.println("Return type : " +
                    method.getReturnType().getName());

            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (var paramType : params)
                System.out.print(" " + paramType.getName());
            System.out.println();
        }
        System.out.println();
    }
    public static void printClassMethods(Class<?> instance)
    {
        Method[] methods = instance.getMethods();
        printEveryMethod(methods);
        methods = instance.getDeclaredMethods();
        printEveryMethod(methods);
    }
    public static void printClassInterfaces(Class<?> instance)
    {
        Class<?>[] ifs = instance.getInterfaces();
        System.out.println("List of interfaces\n");
        for (var ifc : ifs)
            System.out.println(ifc.getName());
    }
    public static void printClassInfo(Class<?> instance)
    {
        printClassName(instance);
        printClassModifier(instance);
        printClassConstructors(instance);
        printClassFields(instance);
        printClassMethods(instance);
        printClassInterfaces(instance);
    }

    public static void main(String[] args)
    {
        MyClass evgeniy = new MyClass("Evgeniy", 20);
        Class<?> me = evgeniy.getClass();
        printClassInfo(me);
    }
}
