package com.example.lenovo.zy_ljq_59.zhujie;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//定义一个Entity 注解类
//这个注解类只能给类用
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Entity {

    String value();
}
