package app.imc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite seu peso (Kg): ");
        double peso = scanner.nextDouble();

        System.out.println("\nDigite sua altura (m): ");
        double altura = scanner.nextDouble();

        //Calculo IMC
        double imc = peso / (altura * altura);

        //Mostra o resultado
        // System.out.println("Seu IMC é igual : " + imc);

        //Tratamento da informação
        if (imc < 18.5) {
            System.out.println("\nMagreza -> Seu IMC é de: " + imc);
          } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("\nNormal -> Seu IMC é de: " + imc);
          } else if (imc >= 24.9 && imc <= 30) {
            System.out.println("\nSobrepeso -> Seu IMC é de: " + imc);
          } else {
            System.out.println("\nObesidade -> Seu IMC é de: " + imc);
        }

    }
}
