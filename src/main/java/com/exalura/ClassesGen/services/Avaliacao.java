package com.exalura.ClassesGen.services;

import java.util.List;

public class Avaliacao<T> {
    private T item;
    private String cometario;
    private double nota;

    public Avaliacao() {
    }

    public Avaliacao(T item, String cometario, double nota) {
        this.item = item;
        this.cometario = cometario;
        this.nota = nota;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getCometario() {
        return cometario;
    }

    public void setCometario(String cometario) {
        this.cometario = cometario;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public static <T> double calcularMediaNotas(List<Avaliacao<T>> avaliacoes) {
        double soma = 0;
        if (avaliacoes.isEmpty()) {
            throw new IllegalArgumentException("A Lista está vazia");
        }
        for (Avaliacao<T> avaliacao : avaliacoes) {
            soma += avaliacao.nota;
        }
        return soma / avaliacoes.size();

    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item +
                ", cometario='" + cometario + '\'' +
                ", nota=" + nota +
                '}';
    }
}
