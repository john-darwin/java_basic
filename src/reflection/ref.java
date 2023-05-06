package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ref {
	
    public static void main(String[] args) throws Exception {
        // 获取 Class 对象
        Class<?> clazz = Class.forName("MyClass");
        // 获取构造器
        Constructor<?> constructor = clazz.getConstructor(int.class);
        // 实例化对象
        Object obj = constructor.newInstance(42);
        // 调用方法
        Method method = clazz.getMethod("getValue");
        int value = (int) method.invoke(obj);
        System.out.println(value);
}
}
