package ex05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConjuntoOrdenado <T extends Comparable<T>>{

    List<T> conj = new ArrayList<>();


    public void adicionar(T element){
        conj.add(element);
        Collections.sort(conj);
    }

    public void remover(T element){
        conj.remove(element);
    }

    public T obter(int i){
       return conj.get(i);
    }

}
