package somavetores;
import javax.swing.JOptionPane;

public class SomaVetores {

    public static void main(String[] args) {
        double[] valores = new double[5];
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: "));
            total += valores[i];
        }
        JOptionPane.showMessageDialog(null, "Valor total: " + total);
    }
}
