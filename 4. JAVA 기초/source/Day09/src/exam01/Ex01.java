package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        Class<Person> cls = Person.class;

        System.out.println("----- 생성자 -----");
        for (Constructor constructor1 : cls.getConstructors()) {
            System.out.println(constructor1);
        }

        System.out.println("----- Declared 생성자 -----");
        for (Constructor constructor2 : cls.getDeclaredConstructors()){
            System.out.println(constructor2);
        }

        System.out.println("----- 멤버 변수 -----");
        for (Field field1 : cls.getFields()) {
            System.out.println(field1);
        }

        System.out.println("----- Declared 멤버 변수 -----");
        for (Field field2 : cls.getDeclaredFields()) {
            System.out.println(field2);
        }



        System.out.println("----- 메서드 -----");
        for (Method method1 : cls.getMethods()) {
            System.out.println(method1);
        }

        System.out.println("----- Declared 메서드 -----");
        for (Method method2 : cls.getDeclaredMethods()) {
            System.out.println(method2);
        }
    }
}
