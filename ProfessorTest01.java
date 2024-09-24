package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 100;
        professor.sexo = 'M';

        //Imprimir em uma linha só
        System.out.println("Nome do seu professor é " + professor.nome + " ele tem " + professor.idade +
        " anos de idade, e seu sexo é " + professor.sexo );
    }
}
