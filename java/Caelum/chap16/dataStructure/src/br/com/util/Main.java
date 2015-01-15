package br.com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.example.Conta;
import br.com.example.ContaCorrente;
import br.com.example.MyArrayList;

public class Main {
    public static void main(String[] args) {
        
        // ArrayList test
        MyArrayList names = new MyArrayList();
        names.add("Manoel");
        names.add("João");
        names.add("Maria");
        System.out.println(names.getSize());
        
        names.printNames();
        names.ordenar();
        System.out.println("");
        names.printNames();
        
        // Comparable test
        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente("João", 2000));
        contas.add(new ContaCorrente("Maria", 1000));
        contas.add(new ContaCorrente("Pedro", 1500));
        
        System.out.println("");
        for(Conta conta : contas){
            System.out.println(conta.getName()+" - "+conta.getSaldo());
        }
        
        Collections.sort(contas);
        
        System.out.println("");
        for(Conta conta : contas){
            System.out.println(conta.getName()+" - "+conta.getSaldo());
        }
    }
}
