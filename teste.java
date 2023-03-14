public class teste{
    
    public static void main(String[] args) {
        /*Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias. 
        Faça um programa para converter este tempo em anos, meses e dias, mostrando essa informação. 
        Assuma que cada mês possui sempre 30 dias. */

        int valor = 400;
        int anos = 0;
        int meses = 0;
        int dias = 0;

        int ano = 0;
        int mes = 0;

        ano = valor%365;
        mes = valor%30;

        if (ano != valor){
            ano = valor / 365;
        }

        if (mes != valor){
            mes = valor / 30;
        }


        System.out.println(ano);

        System.out.println("Sem acidentes no periodo de " + anos + " anos, " + meses + " meses, " + dias + " dias.");

 
   }
    


}