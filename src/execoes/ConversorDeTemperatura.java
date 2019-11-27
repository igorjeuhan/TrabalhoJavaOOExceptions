package execoes;

public class ConversorDeTemperatura {
   
    public double converterParaCelsius(double f) throws MenorQueZeroAbsolutoException {
        
        if(f < -459.67){
            throw new MenorQueZeroAbsolutoException("Valor inválido, menor que zero absoluto em Fahrenheit!");
        }
        return (f - 32) *  5/9;
    }
    
    public double converterParaFarenheit(double c) throws MenorQueZeroAbsolutoException {
        
        if(c < -273.15){
            throw new MenorQueZeroAbsolutoException("Valor inválido, menor que zero absoluto em celsius!");
        }
        return (c * 9/5) + 32;
    }
}
