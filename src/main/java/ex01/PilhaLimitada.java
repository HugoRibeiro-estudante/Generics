package ex01;

import java.util.ArrayList;
import java.util.List;

public class PilhaLimitada <T>{

    private List<T> lista = new ArrayList<>();


    public void empilhar(T element){
        lista.add(element);
    }


    public T desempilhar(){
       return lista.remove(lista.size()-1);
    }

    public boolean estaVazia(){
        return lista.isEmpty();
    }

    public int tamanho(){
        return lista.size();
    }
}
