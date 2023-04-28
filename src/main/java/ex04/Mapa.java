package ex04;

import java.util.HashMap;
import java.util.Map;

public class Mapa <T>{

    Map<T, T> map = new HashMap<>();

    public void adicionar(T k, T v){

        map.put(k,v);
    }

    public void remover(T k){

        map.remove(k);
    }

    public T obter(T k){
        return map.get(k);
    }
}
