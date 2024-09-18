package academy.devdojo.maratona.java.introducao;

public class Aula07Arrays03Foreach {
    public static void main(String[] args) {
//        int [] numeros = new int[3]; //Sempre precisamos dar um nome para o array

        //Existe uma forma de inicializarmos os arrays com tamanho e diretamente com valores
        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Coloca as chaves com valore logo depois
        int [] numeros2 = new int[]{1,2,3,4,5};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }


        //Forma nova de imprimimos o array
        /*
        for(tipo variavel(variavel local): nome do array)
            sout(nome da variavel do for)
        o TIPO tem que ser o mesmo que eu declarar no ARRAY
         */
        int [] numeros3 = {5,4,3,2,1};
        for(int num: numeros3){ //Não da para acessar os indices especificos
            System.out.println(num);
        }







    }
}
