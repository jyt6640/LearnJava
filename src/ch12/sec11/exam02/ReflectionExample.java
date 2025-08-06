package ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;

        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameterTypes = constructor.getParameterTypes();
            printParameters(parameterTypes);
            System.out.print(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(");
            Class[] parameterTypes = method.getParameterTypes();
            printParameters(parameterTypes);
            System.out.print(")");
        }
    }

    private static void printParameters(Class[] parameterTypes) {
        for (int i = 0; i < parameterTypes.length; i++) {
            System.out.println(parameterTypes[i].getName());
            if (i < parameterTypes.length - 1) {
                System.out.println(",");
            }
        }
    }
}
