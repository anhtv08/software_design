package DTA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * WeightedGraph
 */
public class WeightedGraph {
    
    /*
     * For instance: finding cheapest flight path from Singapore to Hanoi
     * Sin->Hanoi
     * Sin->HCM-Hanoi
     * Sin->Kula->HCM-Hanoi 
    * Steps:
     * first find all edges of current starting node.
     * store all cheapest price from starting to next destination using Map
     * For instance 
     * (SIN->HN) :150
     * SIN->HCM:100
     * (Sin->kula):40
     * (Kula->HCM): 50
     * (HCM->HN) 30
     * First round:
     * sin->HCM:100
     * sin->kula:40
     * sin-HN:150
     * starting map:
     * current cheapest
     *  map("sin_hn", 150)
     * Initilise visitedCities(city_name, true/false)
     * Initilise unVisitedCities(unvisitedCity) : removed if visited
     * Initilise currentCheapest
     * * Initilise preCheapest
     */
    void findCheapestFightPath(Vertex start, Vertex des){

        // initialisation:
        Map<String, Integer> cheapestPrice = new HashMap<>();
        // second to Last
        Map<String, String> secondToLastStop = new HashMap<>();

        // visitedNode tracker;

        Map<String, Boolean> visitedNode = new HashMap<>();
        visitedNode.put(start.vertexName, true);
        Map<String, Vertex> unVisitedNode = new HashMap<>();
        Vertex currenCity = start;
        int cheapestThoughCurrentCity = 0;
        cheapestPrice.put(currenCity.vertexName, cheapestThoughCurrentCity);

        //cheapestPrice.put(start +, 0);
        
        //get all from current node:
        while(currenCity!=null){
            for (EdgeGraph edgeGraph : currenCity.edgeGraphs) {
                // add to  adjacent Nodes to unvisited list if not.
                cheapestThoughCurrentCity =  cheapestPrice.get(currenCity.vertexName) + edgeGraph.weightedValue;
                //cheapestPrice.put(currenCity.vertexName, cheapestThoughCurrentCity);
                String adjacentCityName = edgeGraph.to.vertexName;
                
                // remove visited ciity
                unVisitedNode.remove(currenCity.vertexName);
                //cheapestPrice.remove(currenCity.vertexName);
    
                if(!visitedNode.containsKey(adjacentCityName)){
                    unVisitedNode.put(adjacentCityName, edgeGraph.to);
                }
                
                // Update pricing map
                if(
                    cheapestPrice.get(adjacentCityName)==null || 
                    cheapestThoughCurrentCity  < cheapestPrice.get(adjacentCityName) 
                ){
                    cheapestPrice.put(adjacentCityName, cheapestThoughCurrentCity);
                    secondToLastStop.put(adjacentCityName, currenCity.vertexName);
    
                }

            }
            // update current city to cheapest next cheapest adjacent city:
            // Entry<String,Integer> currentMin = cheapestPrice.entrySet();
            int currentMin = Integer.MAX_VALUE;
            String key = "temp";
             for(
                Entry<String,Integer> entry : cheapestPrice.entrySet()
             ){
                // key = entry.getKey();
                System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
                if(
                    entry.getValue()< currentMin && 
                    !entry.getKey().equals(currenCity.vertexName)    
                ){
                    currentMin = entry.getValue();
                    key = entry.getKey();
                }
             }
             currenCity = unVisitedNode.get(key);
        }

        // print path:
        String cur = start.vertexName;
        String [] paths  = new String[secondToLastStop.size()+1];
        paths[0] = cur;
        int index =0;
        StringBuilder st = new StringBuilder();
        st.append(cur+"->");
        for(Map.Entry<String, String> entry: secondToLastStop.entrySet()){
            paths[++index] = entry.getKey();
            //paths[index++] = entry.getValue();
            //System.out.println("Path:" + entry.getKey());
            st.append(paths[index]+"->");
        }
        System.out.println(st.toString());
    }
    static class Vertex{
        // noted name is key
        String vertexName;
        // store neighor nodes and weighted score
        List<EdgeGraph> edgeGraphs;

        public Vertex(String vertexName) {
            this.vertexName = vertexName;
            edgeGraphs = new ArrayList<>();
        }

        Map<String, Vertex> weightedEdges;
        void addEdges(EdgeGraph edgeGraph){
            edgeGraphs.add(edgeGraph);
        }
    }
    static class EdgeGraph{
        Vertex from, to;
        String edgeName;
        int weightedValue;

        public EdgeGraph(Vertex from, Vertex to, int weightedValue) {
            this.from = from;
            this.to = to;
            this.weightedValue = weightedValue;
        }
        String getEdgeName (){
            return from.vertexName +"->"+ to.vertexName;
        }
        
    }
    public static void main(String[] args) {
        Vertex sg = new Vertex("SN");
        Vertex hn = new Vertex("HN");
        Vertex hcm = new Vertex("HCM");

        EdgeGraph dEdgeGraph = new EdgeGraph(sg, hn, 150);
        sg.addEdges(dEdgeGraph);
        
        EdgeGraph dEdgeGraph1 = new EdgeGraph(sg, hcm, 50);
        EdgeGraph dEdgeGraph2 = new EdgeGraph(hcm, hn, 50);
        sg.addEdges(dEdgeGraph1);
        hcm.addEdges(dEdgeGraph2);

        WeightedGraph weightedGraph = new WeightedGraph();
        weightedGraph.findCheapestFightPath(sg, hn);

    }
}