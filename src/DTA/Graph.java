package DTA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

public class Graph {
    GraphNode vertex;

    boolean dfs(int searchValue){
        // new HashSet<Integer>();
        return dfs(vertex, searchValue, new HashSet<Integer>()) ==null? false: true;
    }

    GraphNode dfs(GraphNode vertex, int searchValue, Set<Integer> visitedNode){
        visitedNode.add(vertex.data);
        System.out.println("Curent visiting: " + vertex.data);
        if(vertex.data == searchValue){
            System.out.println("found:" + searchValue);
            return vertex;
        }
        
        for (GraphNode vNode : vertex.edges) {
            if(!visitedNode.contains(vNode.data)){
                visitedNode.add(vNode.data);
                if(vNode.data ==searchValue) return vNode;
                dfs(vNode, searchValue, visitedNode);
            }
        }
        return null;
    }
    public Graph(GraphNode vertex) {
        this.vertex = vertex;
    }
    void addEdgesToVertex(GraphNode graphNode){
        vertex.edges.add(graphNode);
    }
    static class GraphNode{
        int data;        
        List<GraphNode> edges;
        public GraphNode(int data) {            
            this.data = data;
            edges = new ArrayList<>();
        }
        void addEdges(GraphNode graphNode){
            edges.add(graphNode);
        }
    }

    public static void main(String[] args) {
        GraphNode graphNode = new GraphNode(0);
        GraphNode graphNode1 = new GraphNode(1);
        GraphNode graphNode2 = new GraphNode(2);
        graphNode.addEdges(graphNode1);
        graphNode.addEdges(graphNode2);
        Graph graph = new Graph(graphNode);
        int searchValue = 10;
        System.out.println("search value :" + searchValue+ ",:"  +graph.dfs(searchValue));   

        searchValue = 1;
        System.out.println("search value :" + searchValue+ ",:"  +graph.dfs(searchValue));   
    }

    
}
