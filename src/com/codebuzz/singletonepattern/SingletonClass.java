package com.codebuzz.singletonepattern;

public class SingletonClass {

    private static SingletonClass singletonClass=null;
    private SingletonClass() {
    }

    public static SingletonClass getInstance(){
        if(singletonClass!=null){
            return singletonClass;
        }
        return singletonClass=new SingletonClass();


    }


}
