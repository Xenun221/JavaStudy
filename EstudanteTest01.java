package academy.devdojo.maratona.javacore.introducaoclasses.test;

import academy.devdojo.maratona.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //inicializando um objeto
        Estudante estudante = new Estudante();

        //Declarando varivel de um objeto
        estudante.nome = "Rockbell";
        estudante.idade = 18;
        estudante.sexo = 'F';

        //imprimindo  valores na variavel
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
