package execoes;

public class Material {
    
    public Material (String n, int q) throws QuantidadeInvalidaException {
        this.setNome(n);
        this.setQuantidade(q);
    }
    
    private String nome;
    private int quantidade;
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setQuantidade(int q) throws QuantidadeInvalidaException {
        
        if (q < 0) {
            throw new QuantidadeInvalidaException("Quantidade inválida, digite outro valor!");
        }
        
        this.quantidade = q;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
}
