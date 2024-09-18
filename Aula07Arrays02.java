package academy.devdojo.maratona.java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        Padroẽs dentro dos tipos que podemos cirar dentro do arrays
         */

        /*
            CADA TIPO DE UM VALOR PÁDRÃO DE INICIALIZAÇÃO:
            byte,short, int,long, float e double o valor e 0
            char(unicode)
            booleano false
            String null
         */
//        char [] idades = new char[3];
//        System.out.println(idades[0]);
//        System.out.println(idades[1]);
//        System.out.println(idades[2]);

        //PT3 IMPRIMINDO OS 3 VALORES
        String [] nomes = new String[3];
        nomes[0] = "Asta";
        nomes[1] = "Rocybell";
        nomes[2] = "CR7";

        for (int i = 0; i < nomes.length; i++) {
            //nomes.lenght diz o tamanho do array, então case eu altere o tamanho do array ele executa normalmente
            System.out.println(nomes[i]);
        }

    }
}
