package atividades;
import java.util.Scanner;

public class canaisDeTV {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Canais disponíveis");
        System.out.println("2 - Cultura ");
        System.out.println("4 - SBT ");
        System.out.println("5 - Globo ");
        System.out.println("7 - Record ");
        System.out.println("9 - Manchete ");
        System.out.println("11 - Gazeta ");
        System.out.println("13 - Bandeirantes");
        System.out.print("Escolha um canal: ");
        
        int canal = myObj.nextInt();
        
        switch (canal) {
            case 2:
                System.out.println("Canal atual: Cultura");
                break;
            case 4:
                System.out.println("Canal atual: SBT");
                break;
            case 5:
                System.out.println("Canal atual: Globo");
                break;
            case 7:
                System.out.println("Canal atual: Record");
                break;
            case 9:
                System.out.println("Canal atual: Manchete");
                break;
            case 11:
                System.out.println("Canal atual: Gazeta");
                break;
            case 13:
                System.out.println("Canal atual: Bandeirantes");
                break;
        }
    }
    
}
