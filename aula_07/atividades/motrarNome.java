package mostrarnome;
import javax.swing.JOptionPane;

public class MostrarNome {

    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Digite seu nome completo:");
    if (nomeCompleto == null || nomeCompleto.trim().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Nenhum nome foi digitado.");
        return;
        }

    String[] nome = nomeCompleto.trim().split("\\s+");
    String resultado = "";
    for (int i = 0; i < nome.length; i++)
        {
        resultado += Character.toUpperCase(nome[i].charAt(0)) + ".";
        }
        JOptionPane.showMessageDialog(null, "Iniciais: " + resultado);
    }
}
