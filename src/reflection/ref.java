package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ref {
	
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("MyClass");
        Constructor<?> constructor = clazz.getConstructor(int.class);
        Object obj = constructor.newInstance(42);
        Method method = clazz.getMethod("getValue");
        int value = (int) method.invoke(obj);
        System.out.println(value);
}
}
