package aula_3;

public class opLogicos {
    
    public static void main(String[] args) {
        int A = 1, B = 2, C = 4, D = 5, E = 2;
        boolean AND;
        boolean OR;
        AND = (A >= 5) && (B <= 4);
        System.out.println("Operador E (A >= 5 E B <= 4): " + AND);
        
        OR = (A >= 5) || (B <= 4);
        System.out.println("Operador OU (A >= 5 E B <= 4): " + OR);
        System.exit(0);
    }
    
}
