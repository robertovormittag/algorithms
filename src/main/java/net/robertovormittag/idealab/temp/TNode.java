
package net.robertovormittag.idealab.temp;

public class TNode {

    private Comparable key;
    private TNode left;
    private TNode right;

    // setters
    public void setKey(Comparable key) {
        this.key = key;
    }
    public void setLeft(TNode left) {
        this.left = left;
    }
    public void setRight(TNode right) {
        this.right = right;
    }

    // getters
    public Comparable getKey() {
        return this.key;
    }
    public TNode getLeft() {
        return this.left;
    }
    public TNode getRight() {
        return this.right;
    }


    public void addNode(TNode newNode) {

        // compare this.key with newNode.key
        int comp = this.key.compareTo(newNode.getKey());

        // if this.key is > newNode.key add to the left
        if (comp > 0) {
            if (left == null) {
                left = newNode;
            } else {
                left.addNode(newNode);
            }
        }

        // if this.key is < newNode.key add to the right
        if (comp < 0) {
            if (right == null) {
                right = newNode;
            } else {
                right.addNode(newNode);
            }

        }


    }

}
