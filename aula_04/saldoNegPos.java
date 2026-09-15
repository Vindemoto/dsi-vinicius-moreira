package atividades;
import java.util.Scanner;

public class saldoNegPos {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Digite o saldo de seu cartão: ");
        double cartao = myObj.nextDouble();
        
        if (cartao == 0) {
            System.out.println("Saldo: ZERADO!");
        }
        else if (cartao > 0) {
            System.out.println("Positivo");
        }
        else if (cartao < 0) {
            System.out.println("Negativo");
        }
    }
    
}