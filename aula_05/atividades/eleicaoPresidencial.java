package grupopessoas;
import javax.swing.JOptionPane;

public class GrupoPessoas {

    public static void main(String[] args) {
        
        int contador = 0;
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            String sexo = JOptionPane.showInputDialog(
                "Digite o sexo (F/M):"
            );

            int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a idade:")
            );

            String estadoCivil = JOptionPane.showInputDialog(
                "Digite o estado civil\n" +
                    "[S] Solteira\n" +
                    "[C] Casada"
            );

            if (sexo.equalsIgnoreCase("F")
                    && idade < 21
                    && estadoCivil.equalsIgnoreCase("S")) {

                contador++;
            }

            continuar = JOptionPane.showInputDialog(
                "Deseja continuar? (S/N)"
            );
        }

        JOptionPane.showMessageDialog(
            null,
            "Quantidade de mulheres solteiras com menos de 21 anos: "
            + contador
        );
    }
}
