package Graphs;

import java.util.*;

import Custom_Linked_List.LL ;

class employee{
    String eName ;
    String department ;
    int duration ;
    int salary ;

    public employee(String eName, String department, int duration, int salary) {
        this.eName = eName;
        this.department = department;
        this.duration = duration;
        this.salary = salary;
    }
}

public class MyGraph{
    Map<employee, LL<employee>> map ;

    public MyGraph() {
        map=new HashMap<>();
    }
    public void addEdge(employee v1,employee v2,boolean isBidirectional){
         LL<employee> v1Neighbour=map.getOrDefault(v1,new LL<>()) ;
         v1Neighbour.insertFirst(v2); ;
         map.put(v1,v1Neighbour) ;
         if(isBidirectional==true){
             LL<employee> v2Neighbour=map.getOrDefault(v2,new LL<>()) ;
             v2Neighbour.insertFirst(v1);
         }
    }
    public void BFS(employee source){
        Queue<employee> bfs=new LinkedList<>() ;
        bfs.add(source) ;
        Set<employee> vis=new HashSet<>() ;
        vis.add(source) ;
        while(!bfs.isEmpty()){
            employee front=bfs.poll() ;
            vis.add(front);
            System.out.println(front.eName);
            ArrayList<employee> neighbours=new ArrayList<>() ;

            neighbours=map.get(front).neighboursList() ;
            for(employee res: neighbours){
                if(!vis.contains(res)){

                    bfs.add(res);
                }
            }
        }

    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            MyGraph graph=new MyGraph() ;
            System.out.println("Enter number of edges of graph: ");
            int n=sc.nextInt() ;
            for (int i = 0; i <n ; i++) {
//                System.out.println("Enter details of both employee simultaneously ");

                graph.addEdge(new employee(sc.next(),sc.next(),2,200),new employee(sc.next(),sc.next(),2, 200),true);
            }
//            Iterator<employee> it=map.i ;
//            System.out.println(graph.map.keySet());

//            System.out.println(graph.map.keySet().getClass().getName());getName
//            System.out.println(graph.map.get();
            for(employee res: graph.map.keySet()){
                graph.BFS(res);
                break;
            }

//            System.out.println(graph.BFS(graph.map.get(0)));
        }

    }
}

//Spanning tree

//1-------2
//| -     |
//|   -5  |
//|  -    |
//3-------4


