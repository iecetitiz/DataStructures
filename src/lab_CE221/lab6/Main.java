package lab_CE221.lab6;

public class Main
{ 
    public static void main(String args[]) 
    {
        Graph g1 = new Graph(6);
        g1.addEdge(1, 5);
        g1.addEdge(1, 4);
        g1.addEdge(3, 1);
        g1.addEdge(4, 2);
        g1.addEdge(4, 5);
        g1.addEdge(5, 0);

        // A graph that contains a cycle
        Graph g2 = new Graph(6);
        g2.addEdge(5, 1);
        g2.addEdge(4, 3);
        g2.addEdge(3, 5);
        g2.addEdge(2, 4);
        g2.addEdge(1, 2);
        g2.addEdge(1, 0);



        //1
        // Graph “g1” is run with topologicalSort() method without modifying, following is the result:
        // 3 1 4 2 5 0
        g1.topologicalSort();


        //2
        // Graph “g2” is run with topologicalSort() method with modifying to detect cycle:
        g2.topologicalSort();

        //3
        // Graph “g1” is run with topologicalSortStack() method:
        g1.topologicalSortStack();

        System.out.println("Using queue:");
        g1.topologicalSort();
        System.out.println("Using stack:");
        g1.topologicalSortStack();


        // Question 4: Comment here
         /*
        if there are multiple node with 0 indegree, there can be multiple answer
        because they choose first index of the order with indegree = 0

        and

        queue use FIFO and stack use LIFO this may cause a different sorting
        for this reason, answers should/may be correct but not same
        */

    } 
} 