package de.dhbw.wwi2022h.prog2.assignment3.impl;

import de.dhbw.wwi2022h.prog2.assignment3.Vertex;

import java.util.List;

public class DefaultVertex<T> implements Vertex<T> {
    public DefaultVertex(T element) {

    }

    @Override
    public void setElement(T element) {

    }

    @Override
    public T getElement() {
        return null;
    }

    @Override
    public void connectVertex(Vertex<T> targetVertex) {

    }

    @Override
    public void disconnectVertex(Vertex<T> targetVertex) {

    }

    @Override
    public List<Vertex<T>> getConnectedVertices() {
        return null;
    }
}
