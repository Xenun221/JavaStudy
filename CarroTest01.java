package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        //Obejto e essa parte de cima. Quando falamos de criar dois objetos
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        //Primeiro Carro
        carro01.nome = "Mercedes";
        carro01.modelo = "Mercedes-AMG-GT 63";
        carro01.ano = 2020;


        //Segundo Carro
        carro02.nome = "BMW";
        carro02.modelo = "BMW X6";
        carro02.ano = 2023;

        //Carro02 faça referencia para o carro02(Referencia de Objeto)
        carro02 = carro01;


        System.out.println("Carro: " + carro02.nome + "\nModelo: " + carro02.modelo + "\nAno de lançamento: " + carro02.ano);
        System.out.println("---------------------------------");
        System.out.println("Carro: " + carro01.nome + "\nModelo: " + carro01.modelo + "\nAno de lançamento: " + carro01.ano);

    }
}
