import java.util.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;
import org.jgrapht.traverse.AbstractGraphIterator;


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
        while (bf.hasNext()) {
            final String country = bf.next();
            System.out.println("This is the First country " + country);
        }

        final Iterator<String> cf = new ClosestFirstIterator<>(myMap, BO);
        while (cf.hasNext()) {
            final String country = cf.next();
            System.out.println("This is the closest to Bolivia " + country);
        }

        final Iterator<String> df = new DepthFirstIterator<>(myMap, BO);
        while (df.hasNext()) {
            final String country = df.next();
            System.out.println("Depth first BO start " + country);
        }
     /*   final Iterator<String> rw = new RandomWalkIterator<>(myMap, BO);
        while (rw.hasNext()) {
            final String country = rw.next();
            System.out.println("Random walk BO start " + country);
        } */
    }
}