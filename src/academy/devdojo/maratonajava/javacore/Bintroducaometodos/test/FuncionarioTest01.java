package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Victor");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1200, 2000, 820.50});

        funcionario.imprime();
    }
}
