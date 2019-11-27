package execoes;

public class Produto {
    
    public Produto(double preco) throws ParametroInvalidoException {
        this.setPreco(preco);
    }
    
    private double preco;

    public double getPreco() {
        return this.preco;
    }

    public final void setPreco(double preco) throws ParametroInvalidoException {
        
        if(preco < 0) {
            //Valor negativo
            //Lançar a exceção para avisar que ocorreu um erro
            throw new ParametroInvalidoException("deu merda pacero!!!");
        }
        this.preco = preco;
    }

    
    
    
}
