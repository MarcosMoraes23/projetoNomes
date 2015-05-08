package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Nome {
    
    
    private Long id;
    private String nome;
    private String sobrenome;

    
    
    public Nome() {
    
    }

    
    public Nome(Long id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    
    
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
    
    
    
//    public boolean inserirNomeTXT (String nome)
//    {
//        if (nome == null)
//        {
//            return false;
//        }
//        
//        
//        try
//        {
//            arquivo.createNewFile();
//            
//            
//        }
//        
//        
//    }
    
    
    
    
//GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
}
