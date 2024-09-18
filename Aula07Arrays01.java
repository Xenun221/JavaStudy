package academy.devdojo.maratona.java.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        /*
        Quero guardar 3 idades de pessoas ao inves de fz 3 variaveis vamos usar arrays.
        ARRAYS A VARIAVEL QUE USANDO PARA DECLRAR E SEMPRE DO TIPO REFERENCE. COMO E REFERENCE POSSO INICIALIZAR
        COM NULO.
        Arrays são considerados objetos dentro da memoria

        Um array (arranjo ou vetor) é um conjunto de dados (que pode assumir os mais diversos tipos, desde do tipo primitivo, a objeto dependendo da linguagem de programação).
        Arrays são utilizados para armazenar mais de um valor em uma única variável.
         */

        int [] idades = new int[3];//ARRAY SÃO INDEXADOS

        //Declarando Arrays
        idades[0] = 21;
        idades[1] = 18;
        idades [2] = 20;

        //Imprimindo Array
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
