import java.util.*;
import java.util.Iterator;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;
import org.jgrapht.traverse.RandomWalkIterator;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;

public class Country {

    //STRING NAME OF THE DOMAIN
    final static String BO = "Bolivia";
    final static String PY = "Paraguay";
    final static String BR = "Brazil";
    final static String PE = "Peru";
    final static String CL = "Chile";
    final static String AR = "Argentina";

    public static void countries() {
        final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
        //DOMAIN
        myMap.addVertex(BO);
        myMap.addVertex(PY);
        myMap.addVertex(BR);
        myMap.addVertex(PE);
        myMap.addVertex(CL);
        myMap.addVertex(AR);
        //RELATION
        myMap.addEdge(BO, PY);
        myMap.addEdge(PY, BR);
        myMap.addEdge(BR, PE);
        myMap.addEdge(PE, CL);
        myMap.addEdge(CL, AR);
        System.out.println(myMap);

        final Iterator<String> bf = new BreadthFirstIterator<>(myMap, BO);
        System.out.println("\n\n BreadthFirstSearch");
        while (bf.hasNext()) {
            final String country = bf.next();
            System.out.println("We are at: " + country);
        }

        final Iterator<String> cf = new ClosestFirstIterator<>(myMap, BO);
        System.out.println("\n\n ClosestFirstSearch");
        while (cf.hasNext()) {
            final String country = cf.next();
            System.out.println("The closest country is: " + country);
        }

        final Iterator<String> df = new DepthFirstIterator<>(myMap, BO);
        System.out.println("\n\n DepthFirstIterator");
        while (df.hasNext()) {
            final String country = df.next();
            System.out.println("Depth first: " + country);
        }

        final Iterator<String> rw = new RandomWalkIterator<>(myMap, BO, false, 12);
        System.out.println("\n\n RandomWalkIterator");
        while (rw.hasNext()) {
            final String country = rw.next();
            System.out.println("Random walking at: " + country);
        }


     System.out.println("\n\n Starting with a new country iteration");

        final Iterator<String> bfs = new BreadthFirstIterator<>(myMap, PY);
        System.out.println("\n\n BreadthFirstSearch");
        while (bfs.hasNext()) {
            final String country = bfs.next();
            System.out.println("We are at: " + country);
        }

        final Iterator<String> cfs = new ClosestFirstIterator<>(myMap, PY);
        System.out.println("\n\n ClosestFirstIterator");
        while (cfs.hasNext()) {
            final String country = cfs.next();
            System.out.println("The closest country is: " + country);
        }

        final Iterator<String> dfs = new DepthFirstIterator<>(myMap, PY);
        System.out.println("\n\n DepthFirstIterator");
        while (dfs.hasNext()) {
            final String country = dfs.next();
            System.out.println("Depth first: " + country);
        }

        final Iterator<String> rwS = new RandomWalkIterator<>(myMap, PY, true, 12);
        System.out.println("\n\n RandomWalkIterator");
        while (rwS.hasNext()) {
            final String country = rwS.next();
            System.out.println("Random walking at: " + country);
        }

        GreedyColoring colors = new GreedyColoring(myMap);
        System.out.println("\n\n" + colors.getColoring());
    }
     }
