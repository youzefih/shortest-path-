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
package edu.sdsu.cs;

import edu.sdsu.cs.datastructures.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GraphApp {

    private List<String> allFileLines;

    private String vertexFileName;
    private String edgesFileName;

    private IGraph<String, Integer> graph;





    private void fileReader(String vertexFile, String edgeFileName) {
        graph = new WDGraph();

        try {

            allFileLines = Files.readAllLines(Paths.get(vertexFile));
            for(String curLine: allFileLines) {
                String[] data = curLine.split(",");
                IVertex<String> vertex = new GraphVertex(data[0]);
                graph.addVertex(vertex);
            }


            allFileLines = Files.readAllLines(Paths.get(edgeFileName));
            for (String curLine: allFileLines){
                String[] data = curLine.split(",");
                IEdge<Integer> current = new WeightedEdge(data[0],data[1], Integer.parseInt(data[2]));
                graph.addEdge(current);
            }

        }catch (IOException e) {
            System.out.println("Your file does not work");
        }

    }

    private void runnerApp() {
        fileReader(vertexFileName, edgesFileName);
        String[] t = (graph.toString().split("],"));
        System.out.println("           -> -> -> Graph Connections -> -> ->\n   -----------------------------------------------------");
        System.out.println("  Authors: Brian Rafferty, Danielle Uy, and Youssef Iraqi \n   -----------------------------------------------------");
        System.out.println("    * Format: Vertex connects to ____ with cost of X *\n   -----------------------------------------------------");
        for(int i=0;i<t.length;i++){
            System.out.println(t[i] + "],\n  --------" + (i+1));
        }
    }

    public static void main(String[] args) {
        GraphApp run = new GraphApp();    // Checks for parameters

        if (args.length == 0) {
            run.vertexFileName = "./cities.csv";
            run.edgesFileName = "./edges.csv";
        } else if (args.length == 2) {
            run.vertexFileName = args[0];
            run.edgesFileName = args[1];
        } else {
            System.out.println("Error: Incorrect number of input arguments(0 or 2) expected, " + args.length + " provided");
            System.exit(0);
        }

        run.runnerApp();

    }
}