package ex02;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Conjunto<Integer> conjunto = new Conjunto<>();

        conjunto.adicionar(1);
        conjunto.adicionar(2);
        conjunto.adicionar(3);

        conjunto.remover(2);

        System.out.println(conjunto.contem(2));
    }
}
