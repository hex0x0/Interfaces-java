import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Funcionario> func = new ArrayList<>();

        String path = "C:\\Users\\delta\\Desktop\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String nome = br.readLine();

            while(nome != null){
                String[] campos = nome.split(",");
                func.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
                nome = br.readLine();
            }

            Collections.sort(func);

            for(Funcionario f: func){
                System.out.println(f);
            }



        }catch(IOException ex){
            try {
                throw new IOException("Erro de leitura");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }
}