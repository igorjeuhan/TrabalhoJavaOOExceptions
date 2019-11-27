package execoes;

public class TestaConversor {
    
    public static void main(String[] args) {
        
        try{
            ConversorDeTemperatura c1 = new ConversorDeTemperatura();
            c1.converterParaCelsius(-470.67); 
        }catch(MenorQueZeroAbsolutoException ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            ConversorDeTemperatura f1 = new ConversorDeTemperatura();
            f1.converterParaFarenheit(-275.15);  
        }catch(MenorQueZeroAbsolutoException ex){
            System.out.println(ex.getMessage());
        }
            
    }
}
