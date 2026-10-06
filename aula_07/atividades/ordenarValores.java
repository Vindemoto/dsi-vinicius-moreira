package ordernarvalores;
import javax.swing.JOptionPane;

public class OrdernarValores {

    public static void main(String[] args) {
        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: "));
        }
 
        int[] ordenado = new int[10];
        for (int i = 0; i < original.length; i++) {
            ordenado[i] = original[i];
        }
 
        // Bubble sort
        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                }
            }
        }
 
        String texto = "";
        for (int i = 0; i < ordenado.length; i++) {
            texto += ordenado[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Ordem crescente: " + texto);
    }
}
