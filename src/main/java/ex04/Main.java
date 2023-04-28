package ex04;

public class Main {
    public static void main(String[] args) {

        Mapa<Integer> map = new Mapa<>();

        map.adicionar(1,1);
        map.adicionar(2,50);
        map.adicionar(3,3);

        map.remover(1);

        System.out.println(map.obter(2));
    }
}
