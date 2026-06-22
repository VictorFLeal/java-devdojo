package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Victor";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1200, 2000, 820.50};

        funcionario.imprime();
    }
}
