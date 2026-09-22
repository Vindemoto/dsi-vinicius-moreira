package pkgfor;

public class FOR {

    public static void main(String[] args) {
        int i, r = 0, num = 5;
        System.out.println("Tabuada do Nº: " + num);
        for (i = 1; i <= 10; i++)
        {
            r = num * i;
            System.out.println(num + " X " + i + " = " + r);
        }
        System.exit(0);
    }
}
