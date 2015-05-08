/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import model.ManipulaArquivo;


/**
 *
 * @author Matheus
 */
public class Principal 
{
    public static void main (String args [])
    {
        
        ManipulaArquivo.getInstance().buscaArquivoNome("nomes");
        ManipulaArquivo.getInstance().buscaArquivoNome("sobrenomes");
        
    }
   
}
