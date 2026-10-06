package paresentredezvalores;
import javax.swing.JOptionPane;

public class ParesEntreDezValores {

    public static void main(String[] args) {
        int[] valores = new int[10];
        String pares = "";
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: "));
            if (valores[i] % 2 == 0) {
                pares += valores[i] + " ";
            }
        }
        if (pares.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum valor par foi digitado.");
        } else {
            JOptionPane.showMessageDialog(null, "Valores pares: " + pares);
        }
    }
}
