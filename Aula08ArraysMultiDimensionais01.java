package academy.devdojo.maratona.java.introducao;

public class Aula08ArraysMultiDimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        // 2 Arrays os dias. 31, 28,31,30

        //Quero algo dinamico aonde tenho que linkas esses dois Arrays de mes e Ano
        //int[] dias = new int[12];

        //Criacao de outro array aonde tem as quantidades de dia do ano(Criacao de arrays multidimensionais)
        int [][] dias = new int[3][3];
        //Dias na posicao 0 e 0 vai receber
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        //Segunda parte:
        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        //Terceira Posoção
        dias[2][0] = 30;
        dias[2][1] = 31;
        dias[2][2] = 30;

        //I COMEÇA NO 0 APOS FINALIZAR A INCREMENTACAO DO J O I VAI INCREMENTANDO +1 E ASSIM SEGEUE O CICLO
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
         }
//
//        //USANDO FOREACH
//        for(int[] arrBase: dias){ //Variavel de referencia que vai ser temporaria enquanto esse for estiver vivo
//            for (int  num: arrBase){
//                System.out.println(num);
//            }

    }
}
