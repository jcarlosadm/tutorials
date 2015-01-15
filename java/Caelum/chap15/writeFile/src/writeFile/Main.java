package writeFile;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        OutputStream os = new FileOutputStream("saida",false);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("ola");
        bw.append("\n");
        bw.newLine();
        bw.write("hello");
        
        bw.close();
    }
}
