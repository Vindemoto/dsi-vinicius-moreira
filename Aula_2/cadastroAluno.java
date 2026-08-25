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
    
    public void exibirDados(){
        System.out.println("Nome: " + nome + 
                "\nNascimento: " + dataNascimento +
                "\nRA: " + RA +
                "\nE-mail: " + email +
                "\nTelefone: " + telefone +
                "\n------------------------------------");
    }
    
    public void excluirDados(){
        this.nome = "";
        this.dataNascimento = "";
        this.RA = 0;
        this.email = "";
        this.telefone = "";
    }
}
