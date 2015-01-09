package br.com.jcarlos.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStream is = new FileInputStream("testFile");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        
        while(s != null){
            System.out.print(s+" ");
            s = br.readLine();
        }
        
        br.close();
    } 
}
