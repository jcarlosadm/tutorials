package scanner;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivo");
        String value = s.nextLine();
        
        while(value!=null){
            if(value.equals("end")==true)break;
            ps.println(value);
            value = s.nextLine();
        }
        
        s.close();
        ps.close();
    }
}
