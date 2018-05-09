package com.example.lenovo.zy_ljq_59.zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//这个注解类只给属性用
@Target(ElementType.FIELD)
public @interface Field {
    //定义valuesshuxing
    String value();
}
