package ex02;

import java.util.ArrayList;
import java.util.List;

public class Conjunto <T>{

    private List<T> list = new ArrayList<>();

    public void adicionar(T element){
        list.add(element);
    }

    public void remover(T element){
        list.remove(element);
    }

    public boolean contem(T element){
        return list.contains(element);
    }

}
