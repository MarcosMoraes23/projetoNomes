package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ManipulaArquivo 
{
    private static ManipulaArquivo manipulaArquivo;
    
    public static ManipulaArquivo getInstance()
    {
        if (manipulaArquivo == null)
        {
            manipulaArquivo = new ManipulaArquivo();
        }
        return manipulaArquivo;
    }
        
  
    public void concatenaNomes() throws IOException
    {
        //preparando arquivo de destino para 'escrever'
        File concatenados = new File("concatenados.txt");
        concatenados.createNewFile();
        FileWriter fileWriter = new FileWriter(concatenados,true);
        BufferedWriter bufferConcatenados = new BufferedWriter(fileWriter);
        
        //lendo arquivo de nomes
        FileReader lerNomes = new FileReader("nomes.txt");
        BufferedReader bufferNomes = new BufferedReader(lerNomes);
        String nomes ;
              
        //lendo arquivo de sobrenomes
        FileReader lerSobrenomes = new FileReader("sobrenomes.txt");
        BufferedReader bufferSobrenomes = new BufferedReader(lerSobrenomes);
        String sobrenomes;
        
        
        
        while ((nomes = bufferNomes.readLine()) != null)
        {
           while((sobrenomes = bufferSobrenomes.readLine()) != null)
           {                
               bufferConcatenados.write(nomes.toUpperCase().concat(" "+sobrenomes.toUpperCase()+"\n"));
           }
           bufferConcatenados.flush();
        }
        
        bufferNomes.close();
        bufferSobrenomes.close();
        bufferConcatenados.close();
    }
 
}
