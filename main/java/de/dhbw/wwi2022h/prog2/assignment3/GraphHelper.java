package de.dhbw.wwi2022h.prog2.assignment3;

import de.dhbw.wwi2022h.prog2.assignment3.impl.DefaultAcyclicGraph;
import de.dhbw.wwi2022h.prog2.assignment3.impl.DefaultVertex;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * <p>
 * Hilfsklasse, die verwendet wird, um Instanzen der verschiedenen Objekte zu erstellen.
 */
public class GraphHelper {
    /**
     * Erstellt ein DefaultVertex Objekt
     *
     * @param element Inhalt des Vertex
     * @param <T>     Typ des Vertex
     * @return Vertex Objekt
     */
    public static <T> Vertex<T> createVertex(T element) {
        return new DefaultVertex<>(element);
    }

    /**
     * Erstellt ein DefaultAcyclicGraph Objekt
     *
     * @param <T> Typ der Vertices des Graphen
     * @return Graph Objekt
     */
    public static <T> AcyclicGraph<T> createDefaultAcyclicGraph() {
        return new DefaultAcyclicGraph<>();
    }
}
