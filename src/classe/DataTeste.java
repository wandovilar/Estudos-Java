package classe;

import javax.swing.*;

public class DataTeste {
    public static void main(String[] args) {


        Data data1 = new Data(12, 11, 2020);

        Data data2 = new Data();


        System.out.printf(data1.obterDataFormatada());
        System.out.printf(data2.obterDataFormatada());


       /* System.out.printf(data.obterDataFormatada());
        System.out.printf(data2.obterDataFormatada());*/


        /*data.imprimirDataFormatada();*/
    }


}
