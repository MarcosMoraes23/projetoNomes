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
        
  
public void concatenaArquivos(String arquivo1, String arquivo2,String extensao)
            
    {
        try
        {
        //preparando arquivo de destino para 'escrever'
        File concatenados = new File("concatenados."+extensao);
        concatenados.createNewFile();
        FileWriter fileWriter = new FileWriter(concatenados,true);
        BufferedWriter bufferConcatenados = new BufferedWriter(fileWriter);
        
        //lendo arquivo de nomes
        FileReader lerNomes = new FileReader(arquivo1);
        BufferedReader bufferNomes = new BufferedReader(lerNomes);
        String nomes ;
        
        String sobrenomes ;
       
        //Concatenando cada nome com todos os sobrenomes do arquivo
        while ((nomes = bufferNomes.readLine()) != null)
        {
            //lendo arquivo de sobrenomes
            FileReader lerSobrenomes = new FileReader(arquivo2);
            BufferedReader bufferSobrenomes = new BufferedReader(lerSobrenomes);
            
          while((sobrenomes = bufferSobrenomes.readLine()) != null)
           {   
               bufferConcatenados.write(nomes.toUpperCase().concat(" "+sobrenomes.toUpperCase()+"\n"));
           }
          bufferConcatenados.flush();
        }
        
        bufferNomes.close();
        bufferConcatenados.close();
        
        JOptionPane.showMessageDialog(null,"Arquivo gravado na pasta do projeto");
        
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível gravar o arquivo. Causa: "+ e.getCause());
        }
    }


 
}
