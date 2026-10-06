package mediasomasituacao;
import javax.swing.JOptionPane;

public class MediaSomaSituacao {

    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite a nota do bimestre " + (i + 1) + ":"));
            soma += notas[i];
        }
        double media = soma / notas.length;
 
        String situacao;
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
        JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: " + situacao);
    }
}
