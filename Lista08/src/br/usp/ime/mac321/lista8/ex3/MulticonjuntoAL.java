package br.usp.ime.mac321.lista8.ex3;

import java.util.ArrayList;

public class MulticonjuntoAL<T> {
    private ArrayList<T> lista;

    public MulticonjuntoAL() {
        super();
        this.lista = new ArrayList<T>();
    }

    public void add(T elemento) {
        lista.add(elemento);
    }

    public void addAll(MulticonjuntoAL<T> m) {
        for(int i = 0; i < lista.size(); i++)
            lista.add(m.lista.get(i));
    }

    public boolean equals(MulticonjuntoStack<T> m) {
        return this.equals(m);
    }
}
