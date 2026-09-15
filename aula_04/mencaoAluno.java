package atividades;
import java.util.Scanner;

public class mencaoAluno {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Digite sua menção [Ex: MB]: ");
        String mencao = myObj.nextLine();
        
        switch (mencao) {
        case ("MB") -> System.out.println("Muito bom");
        case ("B") -> System.out.println("Bom");
        case ("R") -> System.out.println("Regular");
        case ("I") -> System.out.println("Irregular");
    }
}
}