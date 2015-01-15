package br.com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayList {
    
    private List<String> list = null;
    
    public MyArrayList(){
        this.list = new ArrayList<String>();
    }
    
    public void add(String name){
        this.list.add(name);
    }
    
    public void ordenar(){
        Collections.sort(this.list);
    }
    
    public int getSize(){
        return this.list.size();
    }
    
    public void printNames(){
        for(String name : this.list){
            System.out.println(name);
        }
    }
}
