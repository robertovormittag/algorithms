package net.robertovormittag.idealab.structures.nodes;

public class BSTNode {

    private Comparable data;

    private BSTNode left;
    private BSTNode right;

    // public accessor methods
    public Comparable getData() { return data; }

    public BSTNode getLeft() { return left; }
    public BSTNode getRight() { return right; }

    // public mutator methods
    public void setData(Comparable data) {
        this.data = data;
    }
    public void setLeft(BSTNode node) {
        this.left = node;
    }
    public void setRight(BSTNode node) {
        this.right = node;
    }

    /**
     * Inserts a new node as a descendant of this node
     * @param newNode
     */
    public void addNode(BSTNode newNode) {

        // <0 less, 0 equals, >0 greater
        int comp = newNode.getData().compareTo(this.data);

        // if data is less than set left
        if (comp < 0) {
            if (left == null) {
                left = newNode;
            }
            else {
                left.addNode(newNode);
            }
        }

        // if data is greater than set right
        // if data is less than set left
        if (comp > 0) {
            if (right == null) {
                right = newNode;
            }
            else {
                right.addNode(newNode);
            }
        }
    }



    public void inOrderTraversal() {
        if (left != null) { left.inOrderTraversal(); }
        System.out.println(" [" + data.toString() + "] ");
        if (right != null) { right.inOrderTraversal(); }
    }

    public void preOrderTraversal() {
        System.out.println(" [" + data.toString() + "] ");
        if (left != null) { left.inOrderTraversal(); }
        if (right != null) { right.inOrderTraversal(); }
    }

    public void postOrderTraversal() {
        if (left != null) { left.inOrderTraversal(); }
        if (right != null) { right.inOrderTraversal(); }
        System.out.println(" [" + data.toString() + "] ");
    }


}
