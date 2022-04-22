package Graphs;

import java.util.HashMap;
import java.util.Map;

public class Adjacency_List {

    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(10,200) ;
        map.put(20,300) ;
        map.put(30,300) ;
        for (Map.Entry<Integer,Integer> res:map.entrySet()
             ) {
            System.out.print(res.getKey()+":"+res.getValue());
            System.out.println();
        }

    }
}

// Graph traversal techniques
//There are two graph traversal techniques :
//1. BFS - It uses the queue data structure
//2. DFS - It uses stack data structure
//SSSP- single source shortest path
//1. BFS
//2. Bellman Ford Algorithm
//3. Dijsktra's Algorithm


