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


public interface IVertex<V>{

    /**
     * Gets the name of the IVertex  and returns it
     * @param
     * @return the name of the vertex
     */
    V getName();

}

