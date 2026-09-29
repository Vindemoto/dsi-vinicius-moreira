package matrizcadastrardados;
import javax.swing.JOptionPane;

public class MatrizCadastrarDados {

    public static void main(String[] args) {
        int v[][] = new int [2][2];
        String st = "Digite 4 números: ";
        for (int i = 0; i < 2; i++)
        {for (int j = 0; j < 2; j++)
            {st = JOptionPane.showInputDialog(null, st);
            v[i][j] = Integer.parseInt(st);
            } System.exit(0);
        }
    }
}
