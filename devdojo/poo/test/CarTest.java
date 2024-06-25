package devdojo.poo.test;

import devdojo.poo.models.Car;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car carro = new Car();

        System.out.println("DIGITE OS DADOS DO PRIMEIRO CARRO");
        System.out.println("Marca do Carro");
        carro.name = input.next();
        System.out.println("Modelo");
        carro.model = input.next();
        System.out.println("ano do carro");
        carro.year = input.nextInt();

        System.out.println(carro.name);
        System.out.println(carro.model);
        System.out.println(carro.year);

    }

}

