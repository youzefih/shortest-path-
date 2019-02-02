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

public interface IEdge<E> {

    /**
     * Gets the starting edge
     * @param
     * @returns the starting E Vertex
     */
    E getStart();

    /**
     * Gets the Destination edge
     * @param
     * @returns the Destination E Vertex
     */
    E getDestination();

    /**
     * Gets the weight of the edge
     * @param
     * @returns int weight of edge
     */
    int getWeight();

}

