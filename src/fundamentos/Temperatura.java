package fundamentos;

public class Temperatura {


    public static void main(String[] args) {

        final double ajuste = 32;
        final double fator = 5.0/9.0;

        double tempFahrenheit = 86;
        double celsius = (tempFahrenheit - ajuste) * fator;
        System.out.print("Temperatura em fahrenheit é " + tempFahrenheit + " Convertendo em Celsius é: " + celsius);

        tempFahrenheit = 150;
        celsius = (tempFahrenheit - ajuste) * fator;
        System.out.print(" Temperatura em fahrenheit é " + tempFahrenheit + " Convertendo em Celsius é: " + celsius);


    }
}
