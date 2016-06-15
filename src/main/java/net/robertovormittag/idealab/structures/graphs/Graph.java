package net.robertovormittag.idealab.structures.graphs;

import net.robertovormittag.idealab.structures.nodes.GNode;

import java.util.*;

/**
 * Example graph is a generic tree but it does not have to be
 *
 *                1
 *             /  |  \
 *            2   3   4
 *          /  \
 *         5    6
 *
 */
public class Graph {

    // auxiliary fields and methods to visualize the path
    public static List<String> PATH = new ArrayList<>();
    private static void visit(GNode node) {
        PATH.add(node.data.toString());
    }
    public static void resetPath() { PATH.clear(); }
    private static List<GNode> NODES = new ArrayList<>();
    public static void resetNodeVisitedState() {
        for (GNode node : NODES) {
            node.visited = false;
        }
    }


    // nodes that make up the graph
    public static GNode N1;
    public static GNode N2;
    public static GNode N3;
    public static GNode N4;
    public static GNode N5;
    public static GNode N6;

    // static init
    static {

        // create each node
        N1 = new GNode(1);
        N2 = new GNode(2);
        N3 = new GNode(3);
        N4 = new GNode(4);
        N5 = new GNode(5);
        N6 = new GNode(6);


        // set the neighbours i.e. build the graph
        N1.neighbours = new GNode[] {N2, N3, N4};
        N2.neighbours = new GNode[] {N1, N5, N6};
        N3.neighbours = new GNode[] {N1, N2 };
        N4.neighbours = new GNode[] {N1};
        N5.neighbours = new GNode[] {N2};
        N6.neighbours = new GNode[] {N2};

        // add nodes to list for resetting status
        NODES.add(N1);
        NODES.add(N2);
        NODES.add(N3);
        NODES.add(N4);
        NODES.add(N5);
        NODES.add(N6);


    } // static init


    /**
     * Depth Search First
     * @param startNode
     */
    public static void DFS(GNode startNode) {

        // create a stack
        Stack<GNode> stack = new Stack<>();
        // push start node into it
        stack.push(startNode);

        GNode parent = null;

        // loop until the stack is empty
        while(!stack.isEmpty()) {

            // pop the node from the stack
            parent = stack.pop();
            // visit the node if not visited
            if (!parent.visited) {
                visit(parent);
                parent.visited = true;
                // push each neighbour into the stack
                for (GNode child : parent.neighbours) {
                    stack.push(child);
                }

            }

        }

    }

    /**
     * Breadth Search First
     * @param startNode
     */
    public static void BFS(GNode startNode) {

        // create a queue
        Queue<GNode> queue = new LinkedList<GNode>();
        // visit node
        visit(startNode);
        startNode.visited = true;
        // add start node to the queue
        queue.add(startNode);

        GNode parent;

        // loop until queue is empty
        while(!queue.isEmpty()) {
            // poll node from the queue
            parent = queue.poll();
            // loop through all neighbours
            for (GNode child : parent.neighbours) {
                // visit if not visited
                if (!child.visited) {
                    visit(child);
                    child.visited = true;
                    // add to the queue
                    queue.add(child);
                }
            }
        }


    }



}
