package atividades;
import java.util.Locale;
import java.util.Scanner;

public class impostoDeRenda {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Digite o seu salário: ");
        double salario = myObj.nextDouble();
        
        double aliquota;
        double parcelaDeduzir;
        
        if (salario <= 2428.80) {
            aliquota = 0.0;
            parcelaDeduzir = 0.0;
        }
        
        else if (salario <= 2826.65) {
            aliquota = 7.5;
            parcelaDeduzir = 182.16;
        }
        
        else if (salario <= 3751.05) {
            aliquota = 15.0;
            parcelaDeduzir = 394.16;
        }
        
        else if (salario <= 4664.68) {
            aliquota = 22.5;
            parcelaDeduzir = 675.49;
        }
        
        else {
            aliquota = 27.5;
            parcelaDeduzir = 908.73;
        }
        
        double valorImposto = (salario * (aliquota / 100)) - parcelaDeduzir;
 
        if (valorImposto < 0) {
            valorImposto = 0;
        }
 
        System.out.println("--------------------------------------------------");
        System.out.printf(Locale.US, "Salário informado: R$ %.2f%n", salario);
 
        if (aliquota == 0.0) {
            System.out.println("Situação: Isento de Imposto de Renda.");
        } else {
            System.out.printf("Alíquota aplicada: %.1f%%%n", aliquota);
            System.out.printf(Locale.US, "Parcela a deduzir: R$ %.2f%n", parcelaDeduzir);
            System.out.printf(Locale.US, "Valor do imposto a pagar: R$ %.2f%n", valorImposto);
        }
        System.out.println("--------------------------------------------------");
 
        myObj.close();
    
    }
}