package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        Operacao op = new Operacao();
        op.soma(30, 9);
        op.subtracao(9, 6);
        op.multiplicacao(6, 7);
        op.divisao(10, 2);
        op.imprimir();
    }
}
