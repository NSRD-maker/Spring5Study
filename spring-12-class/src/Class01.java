import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();

       /* //方法一
        Class c1 = Person.class;
        System.out.println(c1.hashCode());

        //方法二
        Class c2 = person.getClass();
        System.out.println(c2.hashCode());
        //方法三
        Class c3 = Class.forName("Person");
        System.out.println(c3.hashCode());*/

        long starttime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            person.out();
        }

        long endtime = System.currentTimeMillis();

        System.out.println("输出时间=" + (endtime - starttime) + "ms");


        Class c1 = Person.class;
        Method method = c1.getDeclaredMethod("out", null);

        long starttime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            method.invoke(person, null);
        }
        long endtime2 = System.currentTimeMillis();

        System.out.println("输出时间=" + (endtime2 - starttime2) + "ms");

    }

}

class Person {

    public void out() {

        int a = 100;
//        System.out.println("反射调用方法");
    }

}