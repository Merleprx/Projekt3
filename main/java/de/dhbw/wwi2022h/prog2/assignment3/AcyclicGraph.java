package de.dhbw.wwi2022h.prog2.assignment3;

import java.util.List;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * <p>
 * Ungerichteter, azyklischer Graph, der mehrere Knoten (Vertex) enthält. Knoten können miteinander verbunden werden.
 */
public interface AcyclicGraph<T> {
    /**
     * Fügt dem Graphen einen Knoten hinzu.
     * Ihr könnt davon ausgehen, dass der Knoten weder Verbindungen enthält, noch das Ziel von Verbindungen durch
     * andere Knoten ist.
     * Falls der Knoten bereits im Graphen vorhanden ist, passiert nichts.
     *
     * @param targetVertex Neuer Knoten
     */
    void addVertex(Vertex<T> targetVertex);

    /**
     * Entfernt einen Knoten aus dem Graphen.
     * Falls der Knoten Verbindungen zu anderen Knoten aufweist, müssen alle
     * Verbindungen ebenfalls (beidseitig) entfernt werden.
     * Falls der Knoten nicht im Graphen vorhanden ist, passiert nichts.
     *
     * @param targetVertex Zu entfernender Knoten
     */
    void removeVertex(Vertex<T> targetVertex);

    /**
     * Verbindet zwei Knoten miteinander. Die Verbindung ist ungerichtet (beidseitig).
     * Falls die Knoten bereits verbunden sind, passiert nichts.
     * Falls beide Knoten identisch sind, passiert nichts.
     * Falls hier eine Exception auftritt, müssen ggf. getätigte Änderungen rückgängig gemacht werden.
     *
     * @param vertex1 Zu verbindender Knoten
     * @param vertex2 Zu verbindender Knoten
     * @throws CycleException Falls durch die Verbindung ein Zyklus entstehen würde.
     * @throws GraphException Falls einer oder beide Knoten nicht im Graphen vorhanden sind.
     */
    void connectVertices(Vertex<T> vertex1, Vertex<T> vertex2) throws GraphException, CycleException;

    /**
     * Trennt die ungerichtete Verbindung zweier Knoten.
     * Falls die Knoten nicht verbunden sind, passiert nichts.
     * Falls beide Knoten identisch sind, passiert nichts.
     *
     * @param vertex1 Zu trennender Knoten
     * @param vertex2 Zu trennender Knoten
     * @throws GraphException Falls einer oder beide Knoten nicht im Graphen vorhanden sind.
     */
    void disconnectVertices(Vertex<T> vertex1, Vertex<T> vertex2) throws GraphException;

    /**
     * Liefert eine Liste aller im Graphen enthaltenen Knoten zurück.
     *
     * @return Liste aller Knoten
     */
    List<Vertex<T>> getVertices();
}
