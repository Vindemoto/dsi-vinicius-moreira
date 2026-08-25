package aula_2;

public class Aula_2 {

    public static void main(String[] args) {
        cadAluno aluno = new cadAluno();
        aluno.cadastrarAluno("Vinícius Teixeira Moreira", "18/01/2006", 676939, "vinicius.moreira18@gmail.com", "11 39670-6767");
        aluno.exibirDados();
        aluno.excluirDados();
        aluno.exibirDados();
    }
    
}
