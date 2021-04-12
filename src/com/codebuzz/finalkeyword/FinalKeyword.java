package com.codebuzz.finalkeyword;

public class FinalKeyword {
    //1. Variable
    //2. Function
    //3. Class
    final int a;

    public FinalKeyword(int a) {
        //a=5;
        this.a = a;
    }

    public void someFunction(){
        System.out.println(a*6);
    }

    public static void main(String[] args) {

        FinalKeyword fk=new FinalKeyword(10);
        fk.someFunction();
    }
}
