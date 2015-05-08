package dao;

public class NomeDAO 
{
        private static NomeDAO nomeDAO;
    
    public static NomeDAO getInstance()
    {
        if (nomeDAO == null)
        {
            nomeDAO = new NomeDAO();
        }
        return nomeDAO;
    }
       
    
}
