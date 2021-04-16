package edu.realemj.Exercises17;

import java.util.ArrayList;

public class BinTree <T extends Comparable<T>> {
    private BinNode<T> root;

    public void insert(T data) {
        BinNode<T> node = new BinNode<>(data);
        if(root == null) {
            root = node;
        }
        else {
            insertDown(node, root);
        }
    }

    private void insertDown(BinNode<T> newNode,
                            BinNode<T> currentNode) {
        if(newNode.compareTo(currentNode) < 0) {
            // LEFT
            if(currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            }
            else {
                insertDown(newNode, currentNode.getLeft());
            }
        }
        else {
            // RIGHT
            if(currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            }
            else {
                insertDown(newNode, currentNode.getRight());
            }
        }
    }

    public String toString() {
        GenericQueue<BinNode<T>> q = new GenericQueue<>();
        q.enqueue(root);
        String output = "";
        while(!q.isEmpty()) {
            BinNode<T> n = q.dequeue();
            output += n;
            if(n.getLeft() != null)
                q.enqueue(n.getLeft());
            if(n.getRight() != null)
                q.enqueue(n.getRight());
        }
        return output;
    }

    public static void main(String [] args) {
        BinTree<Integer> tree = new BinTree<>();
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(10);
        tree.insert(3);
        tree.insert(1);
        tree.insert(7);

        System.out.println(tree);

        GenericQueue q = new GenericQueue();
        ArrayList a = new ArrayList();
    }

}
