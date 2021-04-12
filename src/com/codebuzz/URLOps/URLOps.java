package com.codebuzz.URLOps;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLOps {
    public static void downloadImage() throws IOException, FileNotFoundException {
        URL url = new URL("https://source.unsplash.com/WLUHO9A_xik/1600x900");
        InputStream inputStream = new BufferedInputStream(url.openStream());

        FileOutputStream fileOutputStream = new FileOutputStream("image.jpeg");

        byte[] data = new byte[1024];
        while(inputStream.read(data) != -1){
            fileOutputStream.write(data);
        }

        fileOutputStream.close();
        inputStream.close();
    }
    public static void main(String[] args) throws IOException {

                    downloadImage();

    }
}
