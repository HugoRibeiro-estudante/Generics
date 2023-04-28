package Ex03;

import java.util.ArrayList;
import java.util.List;

public class Fila <T>{

    List<T> list = new ArrayList<>();

    public void enfileirar(T element){
        list.add(element);
    }

    public T desenfileirar(){
        list.remove(list.size()-1);
        return list.get(list.size()-1);
    }

    public int tamanho(){
        return list.size();
    }

}
