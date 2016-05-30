package net.robertovormittag.idealab.structures.trees;

import net.robertovormittag.idealab.structures.nodes.BSTNode;

public class BSTree {

    private BSTNode root;

    public BSTree() { root = null; }

    /**
     * Adds a new node on the left or right
     * depending on the data comparison
     *
     * @param data to be added in the tree
     */
    public void add(Comparable data) {

        BSTNode newNode = new BSTNode();
        newNode.setData(data);
        newNode.setLeft(null);
        newNode.setRight(null);

        if (root == null) {
            root = newNode;
        } else {
            // inserts on the left or right
            root.addNode(newNode);
        }
    }


    public boolean find(Comparable data) {

        BSTNode current = root;

        while (current != null) {
            int comp = current.getData().compareTo(data);
            // found a match
            if (comp == 0) {
                return true;
            }
            // no match found so move pointer
            // and current data is greater
            else if (comp > 0){
                current = current.getLeft();
            }
            // or current data is less
            else {
                current = current.getRight();
            }
        }

        // no match found
        return false;
    }


    public void remove(Comparable data) {

        BSTNode nodeToBeRemoved = root;
        BSTNode parent = null;
        boolean found = false;


        while (!found && nodeToBeRemoved != null) {
            int comp = nodeToBeRemoved.getData().compareTo(data);
            if (comp == 0) {
                found = true;
            } else {
                parent = nodeToBeRemoved;
                // move down left
                if (comp > 0) {
                    nodeToBeRemoved = nodeToBeRemoved.getLeft();
                }
                // move down right
                else {
                    nodeToBeRemoved = nodeToBeRemoved.getRight();
                }
            }
        }

        // no match, nothing to remove
        if (!found) {
            return;
        }

        // match found
        // proceed with removal

        // is there an empty subtree?
        if (nodeToBeRemoved.getLeft() == null ||
                nodeToBeRemoved.getRight() == null) {
            BSTNode newChild;
            if (nodeToBeRemoved.getLeft() == null) {
                newChild = nodeToBeRemoved.getRight();
            } else {
                newChild = nodeToBeRemoved.getLeft();
            }
            // found in root
            if (parent == null) {
                root = newChild;
            } else if (parent.getLeft() == nodeToBeRemoved) {
                parent.setLeft(newChild);
            } else {
                parent.setRight(newChild);
            }
            return;
        }


        // neither subtree is empty
        // find smallest element of the right subtree
        BSTNode smallestParent = nodeToBeRemoved;
        BSTNode smallest = nodeToBeRemoved.getRight();

        while (smallest.getLeft() != null) {
            smallestParent = smallest;
            smallest = smallest.getLeft();
        }

        // smallest now contains smallest child in the
        // right subtree
        // move content, unlink child
        nodeToBeRemoved.setData(smallest.getData());
        if (smallestParent == nodeToBeRemoved) {
            smallestParent.setRight(smallest.getRight());
        } else {
            smallestParent.setLeft(smallest.getRight());
        }

    } // end remove


    // print tree in sorted order
    public void inOrderTraversal() {
        if (root != null) {
            root.inOrderTraversal();
        }
        System.out.println();
    }

    public void preOrderTraversal() {
        if (root != null) {
            root.preOrderTraversal();
        }
        System.out.println();
    }

    public void postOrderTraversal() {
        if (root != null) {
            root.postOrderTraversal();
        }
        System.out.println();
    }

} // BSTree
