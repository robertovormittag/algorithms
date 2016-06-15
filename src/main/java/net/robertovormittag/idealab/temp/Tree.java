package net.robertovormittag.idealab.temp;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private TNode root;
    private List<String> list;

    public Tree() {
        list = new ArrayList<>();
    }

    // add al
    public void add(Comparable key) {

        // construct new node
        TNode newNode = new TNode();
        newNode.setKey(key);


        if (root == null) { root = newNode; }
        else {
            root.addNode(newNode);
        }

    }


    private void visit(TNode node) {
        this.list.add(node.getKey().toString());
    }



    public void inOrderTraversal(TNode node) {

        if (node == null) return;

        inOrderTraversal(node.getLeft());
        visit(node);
        inOrderTraversal(node.getRight());
    }

    public void preOrderTraversal(TNode node) {

        if (node == null) return;

        visit(node);
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    public void postOrderTraversal(TNode node) {

        if (node == null) return;

        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        visit(node);

    }



    public List<String> getList() {
        return this.list;
    }
    public void resetList() {
        this.list.clear();
    }
    public TNode getRoot() {
        return this.root;
    }

}
