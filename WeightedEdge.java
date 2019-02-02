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

public class WeightedEdge<E> implements IEdge<E> {

    private E start;
    private E destination;
    private int weight;

    public WeightedEdge(E start, E dest, int weight) {
        this.weight = weight;
        this.start = start;
        this.destination = dest;
    }

    @Override
    public E getStart() {

        return start;
    }

    @Override
    public E getDestination() {

        return destination;
    }

    @Override
    public int getWeight() {

        return weight;
    }

    @Override
    public String toString(){

        return start + " " + destination + " " + weight;
    }

}