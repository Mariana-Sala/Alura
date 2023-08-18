
package calculos;

public class OperacionesLongitud {
    private int logInicial;
    private int logFinal ;
    private double resultado;
    
    public double conversionLongitud(String valorAConvertir){
        if(logInicial == 0 && logFinal == 1 ){
            return resultado = (Double.parseDouble(valorAConvertir)* 1000);
        }else if(logInicial == 0 && logFinal == 2){
            return resultado = Double.parseDouble(valorAConvertir) * 100000;
        }else if(logInicial == 0 && logFinal == 3){
            return resultado = Double.parseDouble(valorAConvertir) * 1000000;
        }else if(logInicial == 0 && logFinal == 4){
            return resultado = Double.parseDouble(valorAConvertir) * 39370;
        }else if(logInicial == 0 && logFinal == 0){
            return Double.parseDouble(valorAConvertir);
        }
        
        if(logInicial == 1 && logFinal == 0 ){
            return resultado = (Double.parseDouble(valorAConvertir) / 1000);
        }else if(logInicial == 1 && logFinal == 2){
            return resultado = Double.parseDouble(valorAConvertir) * 100;
        }else if(logInicial == 1 && logFinal == 3){
            return resultado = Double.parseDouble(valorAConvertir) * 1000;
        }else if(logInicial == 1 && logFinal == 4){
            return resultado = Double.parseDouble(valorAConvertir) * 39.37;
        }else if(logInicial == 1 && logFinal == 1){
            return Double.parseDouble(valorAConvertir);
        }
        
        if(logInicial == 2 && logFinal == 0 ){
            return resultado = (Double.parseDouble(valorAConvertir) / 100000);
        }else if(logInicial == 2 && logFinal == 1){
            return resultado = Double.parseDouble(valorAConvertir) / 100;
        }else if(logInicial == 2 && logFinal == 3){
            return resultado = Double.parseDouble(valorAConvertir) * 10;
        }else if(logInicial == 2 && logFinal == 4){
            return resultado = Double.parseDouble(valorAConvertir) / 2.54;
        }else if(logInicial == 2 && logFinal == 2){
            return Double.parseDouble(valorAConvertir);
        }
        
        if(logInicial == 3 && logFinal == 0 ){
            return resultado = (Double.parseDouble(valorAConvertir) / 100000);
        }else if(logInicial == 3 && logFinal == 1){
            return resultado = Double.parseDouble(valorAConvertir) / 1000;
        }else if(logInicial == 3 && logFinal == 2){
            return resultado = Double.parseDouble(valorAConvertir) / 10;
        }else if(logInicial == 3 && logFinal == 4){
            return resultado = Double.parseDouble(valorAConvertir) / 25.4;
        }else if(logInicial == 3 && logFinal == 3){
            return Double.parseDouble(valorAConvertir);
        }
        
        if(logInicial == 4 && logFinal == 0 ){
            return resultado = (Double.parseDouble(valorAConvertir) / 39370);
        }else if(logInicial == 4 && logFinal == 1){
            return resultado = Double.parseDouble(valorAConvertir) / 39.37;
        }else if(logInicial == 4 && logFinal == 2){
            return resultado = Double.parseDouble(valorAConvertir) * 2.54;
        }else if(logInicial == 4 && logFinal == 3){
            return resultado = Double.parseDouble(valorAConvertir) * 25.4;
        }else {
            return Double.parseDouble(valorAConvertir);
        }
        
    }
    
     

    public void setLogInicial(int logInicial) {
        this.logInicial = logInicial;
    }

    public void setLogFinal(int logFinal) {
        this.logFinal = logFinal;
    }
     
}
