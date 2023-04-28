package Ex03;

public class Main {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println(fila.desenfileirar());

        System.out.println(fila.tamanho());
    }
}
