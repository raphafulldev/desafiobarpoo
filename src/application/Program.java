package application;

import entities.Bill;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);

        while (bill.gender != 'm' && bill.gender != 'M' && bill.gender != 'f' && bill.gender != 'F'){
            System.out.print("Digite um sexo entre M (masculino) ou F (feminino): ");
            bill.gender = sc.next().charAt(0);
        }
        System.out.print("Quandidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quandidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quandidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        System.out.println();
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", bill.feeding());

        if (bill.couvert() == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", bill.couvert());
        }

        System.out.printf("Ingreso = %.2f\n", bill.ticket());
        System.out.println();

        System.out.printf("Valor a pagar = R$ %.2f\n", bill.total());

        sc.close();
    }
}
