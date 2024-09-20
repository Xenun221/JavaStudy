package academy.devdojo.maratona.java.introducao;

public class Aula08ArraysMultiDimensionais02 {
    public static void main(String[] args) {
        //Referenciar um array
        int[] array = {1,2,3};
        //Nessa aula vamos ver como podemos inicializar um array Multidimensionais
        int[][] arrayInt = new int[3][];
        //VAriavel de referencia o valor padrão e NULO

        //Referenciar um array. Não e preciso necessariamente inicializar o array ali no começo
//        arrayInt[0]= new int[2];
//        arrayInt[1] = new int[3];
//        arrayInt[2] = new int[4];


        //Inicializando o Array multidimensional. Não posso inicializar diretamente
        arrayInt[0]= new int[]{1,2};
        arrayInt[1] = array; //Array Referenciado na parte de cima
        arrayInt[2] = new int[]{1,2,3,4};

        //Outro Array multidimensiona. Inicializando direto do array
        int[][] arrayInt2 = {{0,0},{1,2},{1,2,3}}; //Ele ja sabe o tamanho do espaço que ele tem que criar

        for (int[] arrayBase: arrayInt2){
            System.out.print(" \n----");
            for (int num1: arrayBase ){
                System.out.println(num1 + " ");
            }
        }


    }
}
