import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


public class Country {

    //STRING NAME OF THE DOMAIN
    final static String BO = "Bolivia";
    final static String PY = "Paraguay";
    final static String BR = "Brazil";
    final static String PE = "Peru";
    final static String CL = "Chile";
    final static String AR = "Argentina";

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
    myMap.addEdge(BO, BR);
    myMap.addEdge(BO, PE);
    myMap.addEdge(BO, CL);
    myMap.addEdge(BO, AR);
}
