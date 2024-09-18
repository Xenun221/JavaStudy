package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idae >= 15 && idade < 18 categoria juvenil
        //idae >=18 categoria adulto

        //Nos temos 3 categorias if e else não servem mais. Usamos else-if quando temos mais de duas condições como nesse caso:

        int idade = 18;

        //Variavel para guardar a categoria. Toda variavel tem que ser inicializada antes de executa-la
        String categoria;

        //Usando else-if:
        if (idade < 15){
             categoria = "Voce pode jogar na categoria infantil";
        } else if (idade >=15 && idade <18) {
            categoria="Voce pode jogar na categoria juvenil";
        } else {
            categoria= "Voce pode jogar na categoria de adulto";
        }


    }
}
