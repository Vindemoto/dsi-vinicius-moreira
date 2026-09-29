package vetorcadastrardados;
import javax.swing.JOptionPane;

public class VetorCadastrarDados {

    public static void main(String[] args) {
        int v[] = new int [2];
        String st = "Digite dois números: ";
        for (int i = 0; i<2; i++)
        {st = JOptionPane.showInputDialog(null, st);
        v[i] = Integer.parseInt(st);
        System.exit(0);
        }
    }
}
