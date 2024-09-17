package academy.devdojo.maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
            Operadores aritimetioos são operadores que vc consegue realizar matematica
            com o seus numeros
         */
        int n1 = 10;
        int n2 = 20;
        int resultado = n1 + n2;
        System.out.println("Valor: " + resultado);
        //+, -, /, *(Operadores Aritimeticos Basicos)

        //Operadores pt2 relacionais
        /*
        Resto da divisão = %

        Operadores Logicos(Sempre vai retornar booleano)
        < = Menor
        > = Maior
        <= Menor igual
        >= Maior igual
        == Igual
        != Diferente
         */
        int resto = 45 % 2;
        System.out.println(resto);

        //Teste operador Logico
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);

        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezDiferenteDeDez: " + isDezDiferenteDeDez);

        //Operador pt3 Logico AND
        /*
        3 Tipos de operadores logicos

        AND = Comparação (&&)
        OR = Ou um ou Outro (||)
        NOT = Negação (!)
         */


        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Esta dentro da lei: " + isDentroDaLei);
        System.out.println("Esta dentro da lei menor que trinta: " + isDentroDaLeiMenorQueTrinta);

        //Operadores pt4 Logicos OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        //Basta um valor ser verdadeiro para que o resultado seja verdadeiro
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        //Sempre comparar dois valores
        System.out.println("PlayStation compravel: " + isPlayStationCincoCompravel);



        //Operadores pt5 atribuição
        /*
        Operadores de atribuição vão atribuir um valor a mais na sua variavel

        Economizar um pouco de codigo
        += -= *= /= %=
         */

        double bonus = 1800;
        bonus = bonus + 1000;
        // bonus += 1000; Codigo simplificado
        bonus -= 500;
        //Retirando 500 de bonus
        System.out.println("Bonus: " + bonus);

        //Incrementador
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        System.out.println(contador);


        int contador2 = 0;
        //Primeiro faz o que tem que fz com a variavel e depois incrementa mais um
        System.out.println(contador2++);
        //Primeiro vai executar o que tem que ser executado e depois incrementar
        System.out.println(++contador2);
    }
}
