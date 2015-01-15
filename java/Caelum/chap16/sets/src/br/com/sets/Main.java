package br.com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> cargos = new HashSet<>();
        cargos.add("Diretor");
        cargos.add("Gerente");
        cargos.add("Secretária");
        cargos.add("Gerente");
        cargos.add("Diretor");
        System.out.println(cargos);
        
        for (String cargo : cargos) {
            System.out.println(cargo);
        }
        System.out.println("");
        
        // TreeSet pode ser usado se a comparação for importante
        // LinkedHashSet pode ser usado para manter a ordem de inserção
        
        // iterator
        
        Iterator<String> i = cargos.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
