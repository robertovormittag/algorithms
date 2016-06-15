package net.robertovormittag.idealab.structures.nodes;

public class GNode {

    public Comparable data;
    public boolean visited;

    public GNode[] neighbours;

    // constructor
    public GNode(Comparable data) {
        this.data = data;
        this.visited = false;
    }


}
