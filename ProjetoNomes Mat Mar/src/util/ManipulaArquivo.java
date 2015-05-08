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
        
  
//    public void concatenaNomes()
//    {
//        
//        try
//        {
//            //preparando arquivo de destino para 'escrever'
//            File concatenados = new File("concatenados.txt");
//            concatenados.createNewFile();
//            FileWriter fileWriter = new FileWriter(concatenados,true);
//            BufferedWriter bufferConcatenados = new BufferedWriter(fileWriter);
//
//
//
////            while ((nomes = bufferNomes.readLine()) != null)
////            {
////               while((sobrenomes = bufferSobrenomes.readLine()) != null)
////               {                
////                   bufferConcatenados.write(nomes.toUpperCase().concat(" "+sobrenomes.toUpperCase()+"\n"));
////               }
////               bufferConcatenados.flush();
////            }
////
////            bufferNomes.close();
////            bufferSobrenomes.close();
////            bufferConcatenados.close();
////
////        }
////        catch (Exception e)
////        {
////            System.err.println(e);
////        }
//    }
    
    
    public boolean criaArquivosTXT (String nome, String sobrenome)
    {

        try {
            File arquivo = new File (nome+".txt");
            arquivo.createNewFile();
            
            arquivo = new File (sobrenome+".txt");
            arquivo.createNewFile();
           
            return true;
            
        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        } 
    }
    
//    public boolean inserirNomeTXT (String nome, String sobrenome, String nomeArquivo, String sobrenomeArquivo)
//    {
//        if ((nome == null) || (sobrenome == null))
//        {
//            return false;
//        }
//        
//        
//        try
//        {
//            File arquivo = new File()
//            FileWriter escreverArquivo =  
//            
//            
//            
//        }
//        
//        
//    }
    
    
    
    public String lerNomes ()
    {
        String nomes="";
        
        try
        {
        
            FileReader lerNomes = new FileReader("nomes.txt");
            BufferedReader bufferNomes = new BufferedReader(lerNomes);        
            
            
            while (bufferNomes.readLine() != null)
            {
                nomes = nomes + bufferNomes.readLine()+"\n";
            }

        }    
        catch (Exception e)
        {
            System.err.println(e);
            return null;
        }
        
        return nomes;
    }
    
    
    public String lerSobrenomes ()
    {
        String sobrenomes="";
        
        try
        {
        
            FileReader lerSobrenomes = new FileReader("sobrenomes.txt");
            BufferedReader bufferSobrenomes = new BufferedReader(lerSobrenomes);        
            
            
            while (bufferSobrenomes.readLine() != null)
            {
                sobrenomes = sobrenomes + bufferSobrenomes.readLine()+"\n";
            }

        }    
        catch (Exception e)
        {
            System.err.println(e);
            return null;
        }
        
        return sobrenomes;
    }
    
    
 
    public boolean buscaArquivoNome (String nome)
    {
        File arquivo = new File(nome+".txt");
        
        try
        {
            FileReader lerArquivo = new FileReader (arquivo);
            BufferedReader carregaArquivo = new BufferedReader (lerArquivo);
            
            System.out.println("Arquivo Encontrado!");
            return true;
        }
        catch (Exception e)
        {
            System.err.println("Nome de Arquivo Não Encontrado! "+e);
            return false;
        }
        
        
    }
    
    public boolean buscaArquivoSobrenome (String sobrenome)
    {
        File arquivo = new File(sobrenome+".txt");
        
        try
        {
            FileReader lerArquivo = new FileReader (arquivo);
            BufferedReader carregaArquivo = new BufferedReader (lerArquivo);
            
            System.out.println("Arquivo Encontrado!");
            return true;
        }
        catch (Exception e)
        {
            System.err.println("Nome de Arquivo Não Encontrado! "+e);
            return false;
        }
        
        
    }
}
