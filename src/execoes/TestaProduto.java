package execoes;

public class TestaProduto {
    
    public static void main(String[] args) {
        
        try{
            
            Produto p1 = new Produto(-5);
            
        }catch(ParametroInvalidoException ex) {
            //Tratar o erro
            
            System.out.println(ex.getMessage());
        }
        
        
    }
}
