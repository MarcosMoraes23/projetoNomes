
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
