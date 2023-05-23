package de.dhbw.wwi2022h.prog2.assignment3.impl;

import de.dhbw.wwi2022h.prog2.assignment3.AcyclicGraph;
import de.dhbw.wwi2022h.prog2.assignment3.CycleException;
import de.dhbw.wwi2022h.prog2.assignment3.GraphException;
import de.dhbw.wwi2022h.prog2.assignment3.Vertex;

import java.util.ArrayList;
import java.util.List;

public class DefaultAcyclicGraph<T> implements AcyclicGraph<T> {
    private int numVertices;
    private List<List<Integer>> adjacencyList;
    public DefaultAcyclicGraph() {
    this.numVertices = numVertices;
    this.adjacencyList = new ArrayList<>(numVertices);
    for(int i=0;i<numVertices;i++){
        adjacencyList.add(new ArrayList<>());
    }
    }

    @Override
    public void addVertex(Vertex<T> targetVertex) {
    numVertices++;
    adjacencyList.add(new ArrayList<>());
    }

    @Override
    public void removeVertex(Vertex<T> targetVertex) {

    }





    @Override
    public void connectVertices(Vertex<T> vertex1, Vertex<T> vertex2) throws GraphException, CycleException {
        if (vertex1 >= 0 && vertex1 < numVertices && vertex2 >= 0 && vertex2 < numVertices) {
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1);
        }
    }

    @Override
    public void disconnectVertices(Vertex<T> vertex1, Vertex<T> vertex2) throws GraphException {

    }

    @Override
    public List<Vertex<T>> getVertices() {
        return null;
    }
}
