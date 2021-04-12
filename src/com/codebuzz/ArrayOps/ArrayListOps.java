package com.codebuzz.ArrayOps;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayListOps {


    public static void main(String[] args) {
        //Creating list of names
        List<String> city= Arrays.asList("Amrish","Shruti","Bishan","Shruti","Sachin","Ronnie","Bishan","Amrish","Onnie","Bam");

        HashMap<String,Integer> hmap=new HashMap<>();

        for(String str:city){

                if(hmap.containsKey(str)){
                    hmap.put(str,hmap.get(str)+1);
                }
                else{
                    hmap.put(str,1);
                }
        }
        System.out.println(hmap);

    }

}



