package eleicaopresidencial;
import javax.swing.JOptionPane;

public class EleicaoPresidencial {

    public static void main(String[] args) {
        int cand_um = 0;
        int cand_dois = 0;
        int cand_tres = 0;
        int cand_quatro = 0;
        int branco = 0;
        int nulo = 0;

        int voto;

        do {
            voto = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "[1] Candidato 1\n"
                    + "[2] Candidato 2\n"
                    + "[3] Candidato 3\n"
                    + "[4] Candidato 4\n"
                    + "[5] Branco\n"
                    + "[6+] Nulo\n"
                    + "[0] Encerrar\n\n"
                    + "Digite seu voto:"
                )
            );

            if (voto == 1) {
                cand_um++;
            } else if (voto == 2) {
                cand_dois++;
            } else if (voto == 3) {
                cand_tres++;
            } else if (voto == 4) {
                cand_quatro++;
            } else if (voto == 5) {
                branco++;
            } else if (voto >= 6) {
                nulo++;
            }

        } while (voto != 0);

        JOptionPane.showMessageDialog(
            null,
            "Resultado da votação:\n\n"
            + "Candidato 1: " + cand_um + " votos\n"
            + "Candidato 2: " + cand_dois + " votos\n"
            + "Candidato 3: " + cand_tres + " votos\n"
            + "Candidato 4: " + cand_quatro + " votos\n"
            + "Brancos: " + branco + "\n"
            + "Nulos: " + nulo
        );
    }
}
