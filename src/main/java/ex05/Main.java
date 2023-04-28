package ex05;

import ex02.Conjunto;

public class Main {

    public static void main(String[] args) {


        ConjuntoOrdenado<Integer> conj = new ConjuntoOrdenado<>();


        conj.adicionar(1);
        conj.adicionar(2);
        conj.adicionar(3);

        conj.remover(1);

        System.out.println( conj.obter(1));
    }
}
