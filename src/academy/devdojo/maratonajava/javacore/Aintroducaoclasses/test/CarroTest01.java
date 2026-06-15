package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche";
        carro1.modelo = "Cayenne";
        carro1.ano = 2026;

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2026;

        carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);

    }
}
