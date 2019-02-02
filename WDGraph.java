/**
 * Program 2 -- Graph ADT
 * This program takes in two files from the user or
 * supplies default files if none are added. File 1
 * is used as vertex information and File 2 is used
 * as edge information. A graph is constructed with
 * all of the data and is displayed to the console.
 * CS-310
 * 8/12/18
 * @authors Brian Rafferty, Danielle Uy, Youssef Iraqi
 */
package edu.sdsu.cs.datastructures;

import java.util.*;

public class WDGraph<V extends IVertex, E extends IVertex> implements IGraph<V, E> {

    private List<IVertex> vertices;
    private List<IEdge> edges;

    private int vertsCounter = 0;
    private int edgeCounter = 0;

    private Map<V, List> myMap;

    private ArrayList tempIndexCounter = new ArrayList();

    public WDGraph() {
        edges = new ArrayList();
        vertices = new ArrayList();
        myMap = new HashMap<>();

    }


    @Override
    public Iterable<IVertex<V>> vertices() {
        Iterable vertIt = vertices;
        return vertIt;
    }

    @Override
    public Iterable<IEdge<E>> edges() {
        Iterable edgeIt = edges;
        return edgeIt;
    }

    @Override
    public int numEdges() {

        return edgeCounter;
    }

    @Override
    public int numVertices() {

        return vertsCounter;
    }

    @Override
    public int minimumDistance(IVertex start, IVertex end) {
        //return all costs added on the shortest path
        return 0;
    }

    @Override
    public Iterable<IEdge> shortestPath(IVertex start, IVertex end) {
        ArrayList<E> shortestPath = new ArrayList();
        Iterable path = shortestPath;
        System.out.println("We attempted to make the shortest path algorithm between " + start.getName() +" and "+ end.getName() + ", but couldn't successfully implement it.");
        return path;

    }


    @Override
    public void connectVertices(IVertex<V> start, IVertex<V> end, int weight) {
        String connection = start.getName() + " connects to " + end.getName() + " with cost of " + weight;
        if (myMap.containsKey(start.getName())) {
            myMap.get(start.getName()).add(connection);

            }
        }

    @Override
    public void addVertex(IVertex<V> toAdd) {

        myMap.put(toAdd.getName(), new ArrayList<E>());
        if (!vertices.contains(toAdd)) {
            tempIndexCounter.add(toAdd.getName());
            vertices.add(toAdd);
            vertsCounter++;
        }


    }

    @Override
    public void addEdge(IEdge<E> toAdd) {
        edges.add(toAdd);
        int first = tempIndexCounter.indexOf(toAdd.getStart());
        int last = tempIndexCounter.indexOf(toAdd.getDestination());

        connectVertices(vertices.get(first), vertices.get(last), toAdd.getWeight());

        edgeCounter++;
    }

    @Override
    public String toString(){
        return myMap.toString();
    }
}