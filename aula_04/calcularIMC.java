package atividades;
import java.util.Locale;
import java.util.Scanner;
 
public class calcularIMC {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o peso do cliente (kg): ");
        double peso = scanner.nextDouble();
 
        System.out.print("Digite a altura do cliente (m): ");
        double altura = scanner.nextDouble();
 
        double imc = peso / (altura * altura);
 
        String classificacao;
 
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25.0) {
            classificacao = "Eutrófico (Peso normal)";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }
 
        System.out.println("--------------------------------------------------");
        System.out.printf(Locale.US, "Peso: %.2f kg%n", peso);
        System.out.printf(Locale.US, "Altura: %.2f m%n", altura);
        System.out.printf(Locale.US, "IMC calculado: %.2f kg/m²%n", imc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("--------------------------------------------------");
 
        scanner.close();
    }
}