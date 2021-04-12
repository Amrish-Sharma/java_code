package com.codebuzz.inputops;

import java.util.Scanner;

public class InputOps {

    public final int a;

    public InputOps(int a) {
        this.a=a;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Enter the value for a: ");
        Scanner sc=new Scanner(System.in);
        //Integer text=sc.nextInt();

        InputOps inputOps=new InputOps();

        //System.out.println("Hello: ",a);



    }
}
