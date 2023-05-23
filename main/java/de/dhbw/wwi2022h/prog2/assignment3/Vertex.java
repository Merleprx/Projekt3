package de.dhbw.wwi2022h.prog2.assignment3;

import java.util.List;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * <p>
 * Graphknoten (Vertex), die miteinander verbunden werden können. Enthalten Elemente mit beliebigem Datentypen.
 */
public interface Vertex<T> {
    /**
     * Überschreibt das enthaltene Element
     *
     * @param element Neuer Inhalt
     */
    void setElement(T element);

    /**
     * Gibt das enthaltene Element zurück
     *
     * @return Aktueller Inhalt
     */
    T getElement();

    /**
     * Verbindet diesen Knoten mit einem Anderen. Verbindungen sind ungerichtet, der andere Knoten soll also
     * automatisch eine Rückverbindung erhalten.
     * Es passiert nichts, falls:
     * - Der target Knoten bereits verbunden ist
     * - Der target Knoten derselbe wie der Aktuelle ist
     *
     * @param targetVertex Der zu verbindende Knoten
     */
    void connectVertex(Vertex<T> targetVertex);

    /**
     * Löscht die Verbindung dieses Knotens mit einem Anderen. Verbindungen sind ungerichtet, eventuelle Rückverbindungen
     * sollen also auch automatisch gelöscht werden.
     * Es passiert nichts, falls:
     * - Der target Knoten nicht verbunden ist
     * - Der target Knoten derselbe wie der Aktuelle ist
     *
     * @param targetVertex Der zu trennende Knoten
     */
    void disconnectVertex(Vertex<T> targetVertex);

    /**
     * Liefert eine Liste aller Knoten, mit denen dieser Knoten verbunden ist.
     *
     * @return Liste aller verbundenen Knoten
     */
    List<Vertex<T>> getConnectedVertices();
}
