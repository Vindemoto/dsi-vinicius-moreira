package aula_3;

public class opComp {
    
    public static void main(String[] args) {
        int A = 1, B = 8, C = 4, D = 5, E = 2;
        double R;
        boolean VF;
        R = A + B - C * D / E;
        VF = A + B - C * D / E >= 5;
        System.out.println("1 + 8 - 4 * 5 / 2 = " + R);
        System.out.println("O resultado é maior ou igual que 5?: " + VF);
        System.exit(0);
    }
    
}
