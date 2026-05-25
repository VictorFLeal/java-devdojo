package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie varáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de (salario), na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Victor";
        String endereco = "Rua 1, do lado da rua 2";
        double salario = 2100.12;
        String dataRecebimentoSalario = "05/06/2026";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
