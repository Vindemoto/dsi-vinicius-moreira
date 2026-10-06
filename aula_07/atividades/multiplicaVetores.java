package multiplicavetores;
import javax.swing.JOptionPane;

public class MultiplicaVetores {

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
 
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Vetor A - Digite o " + (i + 1) + "º valor: "));
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Vetor B - Digite o " + (i + 1) + "º valor: "));
        }
 
        String texto = "";
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
            texto += a[i] + " x " + b[i] + " = " + c[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Vetor C:\n" + texto);
    }
}
