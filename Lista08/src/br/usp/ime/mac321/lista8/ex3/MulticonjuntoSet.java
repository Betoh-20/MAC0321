package br.usp.ime.mac321.lista8.ex3;

import java.util.HashSet;
import java.util.Set;

public class MulticonjuntoSet<T> {
    private Set<T> lista;

    public MulticonjuntoSet() {
        super();
        this.lista = new HashSet<T>();
    }

    public void add(T elemento) {
        lista.add(elemento);
    }

    public void addAll(MulticonjuntoSet<T> m) {
        for(int i = 0; i < lista.size(); i++)
            lista.add(m.lista.iterator().next());
    }

    public boolean equals(MulticonjuntoSet<T> m) {
        return this.equals(m);
    }
}