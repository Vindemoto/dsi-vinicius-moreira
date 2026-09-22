package do_while;

public class DO_WHILE {

    public static void main(String[] args) {
        int cont = 1, r = 0, num = 5;
        System.out.println("Tabuada do Nº: " + num);
        do
        {
            r = num * cont;
            System.out.println(num+" X " + cont + " = " + r);
            cont = cont + 1;
        } while (cont <= 10);
        System.exit(0);
    }
}
