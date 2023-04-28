package ex01;

public class Main {

    public static void main(String[] args) {

        PilhaLimitada<String> pilha = new PilhaLimitada<>();

        pilha.empilhar("a");
        pilha.empilhar("b");
        pilha.empilhar("c");

        System.out.println(pilha.desempilhar());
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.tamanho());

    }
}
