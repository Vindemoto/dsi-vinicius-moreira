package calculadora;

public class Operacao {
    int totalsoma;
    int totalsub;
    int totalmult;
    float totaldiv;
    
    public int soma(int a, int b){
        totalsoma = a + b;
        return totalsoma;
    };
    
    public int subtracao(int a, int b){
        totalsub = a - b;
        return totalsub;
    };
    
    public int multiplicacao(int a, int b){
        totalmult = a * b;
        return totalmult;
    };
    
    public float divisao(int a, int b){
        totaldiv = a / b;
        return totaldiv;
    };
        
    public void imprimir(){
        System.out.println("Valor da soma: 30 + 9 = " + totalsoma);
        System.out.println("Valor da subtração: 9 - 6 = " + totalsub);
        System.out.println("Valor da multiplicação: 6 * 7 = " + totalmult);
        System.out.println("Valor da divisão: 10 / 2 = " + totaldiv);
    };
};
