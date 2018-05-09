package com.example.lenovo.zy_ljq_59.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Text1 {


     public static void  main(String[] args) throws Exception {



     }

     //通过反射 相应的方法 用invoke 直接给参数设置值
     private  void method5() throws Exception {
         Class<Person> clazzP=Person.class;
       Class cla=Person.class;


         //创建对象
         Person person = clazzP.newInstance();
         Method method=clazzP.getMethod("setName", String.class);
         method.invoke("李先生");
     }

     private void method4() throws Exception {
         //获取属性

         Class<Person> classP=Person.class;

         Constructor<Person> constructor = classP.getConstructor(String.class);
         Person person = constructor.newInstance("xiaownag");
         Field field = classP.getDeclaredField("name");

         //暴力访问 改变对象的值
         field.setAccessible(true);
         field.set(person,"dami");

         //获取对象里面的属性值

     }

     private void method3(){

         //获取多个构造方法

         Class<Person> classP= Person.class;
         //返回的是数组
         Constructor<?>[] constructors = classP.getConstructors();


     }


     //加泛型 person类
    private void method2() throws Exception {

        Class<Person> classP=Person.class;
        //获取构造
        Constructor<Person> constructor = classP.getConstructor(String.class);

        //创建一个实例
        Person person = constructor.newInstance("xiaownag");
    }

    // 获取object 没有制定对象什么类型
     private void method1() throws ClassNotFoundException {
         //获取字节码的三种方式
         Class clazz1= Person.class;
         Class clazz2=  new Person("xiaowang").getClass();
         Class clazz3= Class.forName("com.example.lenovo.zy_ljq_59.fanshe.Person");
     }

}
