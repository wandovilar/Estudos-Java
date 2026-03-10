package classe;

import javax.swing.*;
import java.time.LocalDate;

public class Data {

    int dia;
    int mes;
    int ano;


    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        int dia = 1;
        int mes = 1;
        int ano = 1970;
    }


    String obterDataFormatada() {
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }


}
