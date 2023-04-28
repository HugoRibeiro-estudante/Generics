package ex05;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoOrdenado <T extends Number>{

    List<T> conj = new ArrayList<>();

    public void adicionar(T element){
        conj.add(element);
    }

    public void remover(T element){
        conj.remove(element);
    }

    public T obter(int i){
       return conj.get(i);
    }

}
