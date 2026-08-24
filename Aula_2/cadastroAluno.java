package aula_2;

public class cadAluno {
    String nome;
    String dataNascimento;
    int RA;
    String email;
    String telefone;
    
    public void cadastrarAluno(String nome, String dataNascimento, int RA, String email, String telefone){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RA = RA;
        this.email = email;
        this.telefone = telefone;
    }
    
    public void verificarCadastro(){
        System.out.println("Nome: " + nome + 
                "\nNascimento: " + dataNascimento +
                "\nRA: " + RA +
                "\nE-mail: " + email +
                "\nTelefone: " + telefone);
    }
}
