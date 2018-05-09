package com.example.lenovo.zy_ljq_59.fanshe;

public class Person {

    private  String name;
    public  String age;


    //无参
    public  Person(){

    }
    //构造
    public  Person (String name){
        this.name=name;
    }
    //get and set

    public  Person (String name ,String age){
      this.name=name;
        this.age=age;

    }

     public void setName(String name){
        this.name=name;
     }

     public String getName(){
        return  name;

     }
}
