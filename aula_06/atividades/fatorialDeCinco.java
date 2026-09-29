package fatorialdecinco;
import javax.swing.JOptionPane;

public class FatorialDeCinco {

    public static void main(String[] args) {
        int numero = 5;
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null,
                "O fatorial de " + numero + " é " + fatorial);
    }
}
