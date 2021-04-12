package com.codebuzz.fileops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOps {


    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("newfile.txt",false );
        Scanner sc=new Scanner(System.in);
        String text;


        do{
            text=sc.next()+"\n";
            fos.write(text.getBytes(StandardCharsets.UTF_8));
        }
        while(!text.equals("end"));
        fos.close();
    }
}
