
package com.example.lenovo.zy_ljq_59.zhujie;

import java.lang.annotation.Annotation;

public class Text {

    public static void  main(String[] args) throws Exception {

        Class clazz=Person.class;
        //获取到person上面的注解
        Entity entity = (Entity) clazz.getAnnotation(Entity.class);


        Field field = (Field) clazz.getAnnotation(Field.class);
        System.out.println(entity.value());
        System.out.println(field.value());


    }



}
