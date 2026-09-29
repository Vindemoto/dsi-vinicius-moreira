package matrizbuscardados;
import javax.swing.JOptionPane;

public class MatrizBuscarDados {

    public static void main(String[] args) {
        int v[][] = new int [2][2];
        int n;
        String st = "Digite o número para busca: ";
        st = JOptionPane.showInputDialog(null, st);
        n = Integer.parseInt(st);
        for (int i = 0; i < 2; i++)
            {for (int j = 0; j < 2; j++)
                {if (v[i][j] == n)
                    {st = "Valor encontrado: ";
                        JOptionPane.showMessageDialog(null, st);
                    }
                            else
                            {st = "Valor não encontrado";
                                JOptionPane.showMessageDialog(null, st);
                            } System.exit(0);
                }
            }
    }
}
