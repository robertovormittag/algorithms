package net.robertovormittag.idealab.structures.graphs;

import net.robertovormittag.idealab.structures.nodes.GNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Before
    public void setUp() throws Exception {

        Graph.resetPath();
        Graph.resetNodeVisitedState();
    }

    @After
    public void tearDown() throws Exception {

        Graph.resetPath();
        Graph.resetNodeVisitedState();
    }

    @Test
    public void testBFS() throws Exception {

        Graph.BFS(Graph.N1);
        System.out.println(Graph.PATH);

    }


    @Test
    public void testDFS() throws Exception {
        Graph.DFS((Graph.N1));
        System.out.println(Graph.PATH);
    }
}
