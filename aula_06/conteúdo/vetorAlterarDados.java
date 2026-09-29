package vetoralterardados;
import javax.swing.JOptionPane;

public class VetorAlterarDados {

    public static void main(String[] args) {
        int v[] = new int[2];
        int n;
        String st = "Digite o número para alterar: ";
        st = JOptionPane.showInputDialog(null, st);
        n = Integer.parseInt(st);
        for (int i = 0; i <2; i++)
        {if (v[i] == n)
            {st = "Digite um novo número";
            JOptionPane.showMessageDialog(null, st);
            v[i] = Integer.parseInt(st);
            }
                else
                    {st = "Valor não encontrado";
                    JOptionPane.showMessageDialog(null, st);
                    System.exit(0);
                    }
        }
    }   
}
