package br.usp.ime.mac321.lista8.ex3;

import java.util.Stack;

public class MulticonjuntoStack<T> {
    private Stack<T> lista;

    public MulticonjuntoStack() {
        super();
        this.lista = new Stack<T>();
    }

    public void add(T elemento) {
        lista.add(elemento);
    }

    public void addAll(MulticonjuntoStack<T> m) {
        for(int i = 0; i < lista.size(); i++)
            lista.add(m.lista.get(i));
    }

    public boolean equals(MulticonjuntoStack<T> m) {
        return this.equals(m);
    }
}
