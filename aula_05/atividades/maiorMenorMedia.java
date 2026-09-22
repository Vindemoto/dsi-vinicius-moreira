package maiormenormedia;
import javax.swing.JOptionPane;

public class MaiorMenorMedia {

    public static void main(String[] args) {
        int idade;
        int cont = 1;
        double media = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;
        
        for (cont = 1; cont <= 20; cont++) {
            idade = Integer.parseInt(
                JOptionPane.showInputDialog(
                "Digite a idade do " + cont + "º aluno")
            );
            
            if (cont == 1) {
                maior = idade;
                menor = idade;
            } else {
                if (idade > maior) {
                    maior = idade;
                }

                if (idade < menor) {
                    menor = idade;
                }
        
            soma += idade;
            media = soma / cont;
            }           
        } 
JOptionPane.showMessageDialog(
null,
            "Maior idade: " + maior
          + "\nMenor idade: " + menor
          + "\nMédia das idades: " + media
);
};
}
