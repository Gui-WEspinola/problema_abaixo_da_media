package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }

        double media = 0;

        for (double v : vect) {
            media += v;
        }

        media = media / vect.length;

        System.out.printf("%nMEDIA DO VETOR = %.3f%n" , media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");

        for (double number : vect) {
            if (number < media){
                System.out.printf("%.1f%n", number);
            }
        }
        scanner.close();
    }
}
