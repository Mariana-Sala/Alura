package calculos;

import javax.swing.JOptionPane;

public class OperacionesTemperatura {
    private int logInicial;
    private int logFinal;
    private double resultado;

    public double conversionLongitud(String valorAConvertir) {
        if (logInicial == 0 && logFinal == 1) {
            return resultado = (Double.parseDouble(valorAConvertir) * 1.8) + 32;
        } else if (logInicial == 0 && logFinal == 2) {
            return resultado = Double.parseDouble(valorAConvertir) + 273.15;
        } else if (logInicial == 0 && logFinal == 0) {
            return Double.parseDouble(valorAConvertir);
        }

        if (logInicial == 1 && logFinal == 0) {
            return resultado = (Double.parseDouble(valorAConvertir) - 32) * 5 / 9;
        } else if (logInicial == 1 && logFinal == 2) {
            return resultado = (Double.parseDouble(valorAConvertir) - 32) * 5 / 9 + 273.15;
        } else if (logInicial == 1 && logFinal == 1) {
            return Double.parseDouble(valorAConvertir);
        }

        if (logInicial == 2 && logFinal == 0) {
            return resultado = (Double.parseDouble(valorAConvertir) - 273.15);
        } else if (logInicial == 2 && logFinal == 1) {
            return resultado = (Double.parseDouble(valorAConvertir) - 273.15) * 1.8 + 32;
        } else {
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
