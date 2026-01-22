package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {

    HashMap<Node, ArrayList<Node>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void insertNode(Node v1) {
        adjacencyList.put(v1, new ArrayList<>());
    }
    
    public void connectNodes(Node source,Node destination)
    {
    	List<Node> temp=adjacencyList.get(source);
    	temp.add(destination);
    }

    public void print() {
        for (Node current : adjacencyList.keySet()) {
            System.out.print(current.value+"->");   
            List<Node> temp = adjacencyList.get(current);
        for(Node n:temp)
        {
        	System.out.print(n.value+" ");
        }
        System.out.println();
        }
    }
}

		