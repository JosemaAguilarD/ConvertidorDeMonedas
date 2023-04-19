
package pe.isil.conversormonedas.controlador;


public class Conversor {
    
    int valor;

    public Conversor() {
    }

    public Conversor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public double SolADolar(){
        double tc = 0.26;
        double valorMod = valor * tc;
        return valorMod;
    }
    
     public double DolarASol(){
        double tc = 3.78;
        double valorMod = valor * tc;
        return valorMod;
    }
     
    public double SolAEuro(){
        double tc = 0.24;
        double valorMod = valor * tc;
        return valorMod;
    }
    
    public double EuroASol(){
        double tc = 4.14;
        double valorMod = valor * tc;
        return valorMod;
    }
     
    public double SolALibra(){
        double tc = 0.21;
        double valorMod = valor * tc;
        return valorMod;
    }
       
    public double LibraASol(){
        double tc = 4.70;
        double valorMod = valor * tc;
        return valorMod;
    }
      
    public double SolAYen(){
        double tc = 35.68;
        double valorMod = valor * tc;
        return valorMod;
    }
       
    public double YenASol(){
        double tc = 0.028;
        double valorMod = valor * tc;
        return valorMod;
    }
    
    public double SolAWon(){
        double tc = 352.40;
        double valorMod = valor * tc;
        return valorMod;
    }
    
    public double WonASol(){
        double tc = 0.0028;
        double valorMod = valor * tc;
        return valorMod;
    }
}
