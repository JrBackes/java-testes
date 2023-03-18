public class programa_acidentes {

    public static void main(String[] args) {
        /*
         * Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de
         * dias.
         * Faça um programa para converter este tempo em anos, meses e dias, mostrando
         * essa informação.
         * Assuma que cada mês possui sempre 30 dias.
         */

        /*
         * Lógica
         * 1 -
         * 
         */
        int valor = 400;

        // Iniciando variáveis
        int anos = 0;
        int meses = 0;
        int dias = valor;

        if (dias >= 365) {
            for (int i = 0; dias >= 365; i++) {
                anos++;
                dias = dias - 365;
            }
        }

        if (dias >= 30) {
            for (int i = 0; dias >= 30; i++) {
                meses++;
                dias = dias - 30;
            }
        }

        if (meses >= 12) {
            for (int i = 0; meses >= 12; i++) {
                anos++;
                meses = meses - 12;
            }
        }
        System.out.println("");
        System.out.println(
                "Lembrando que neste exercicio, o mês é considerado com 30 dias, portanto o ano tem 360 dias.");
        System.out.println("O Valor de dias informado foi " + valor + " dias");
        System.out.println("Sem acidentes no periodo de " + anos + " anos, " + meses + " meses, " + dias + " dias.");

    }

}
