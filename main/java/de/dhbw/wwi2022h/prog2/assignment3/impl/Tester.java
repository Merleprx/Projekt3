package de.dhbw.wwi2022h.prog2.assignment3.impl;

import de.dhbw.wwi2022h.prog2.assignment3.*;

/*
Hier könnt ihr manuelle Tests ausführen.

Beispielhaft findet ihr hier einen sehr simplen Test,
der keine Exception werfen sollte.
*/

public class Tester {
    public static void main(String[] args) {
        AcyclicGraph<String> graph = GraphHelper.createDefaultAcyclicGraph();
        Vertex<String> vertex1 = GraphHelper.createVertex("Hallo");
        Vertex<String> vertex2 = GraphHelper.createVertex(" ");
        Vertex<String> vertex3 = GraphHelper.createVertex("Welt!");

        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);

        try {
            graph.connectVertices(vertex1, vertex2);
            graph.connectVertices(vertex2, vertex3);
        } catch (GraphException e) {
            System.out.println("GraphException!");
        } catch (CycleException e) {
            System.out.println("CycleException!");
        }

        System.out.println("Finished.");
    }
}
