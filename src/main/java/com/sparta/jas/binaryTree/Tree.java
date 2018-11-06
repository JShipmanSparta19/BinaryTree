package com.sparta.jas.binaryTree;

import com.sparta.jas.binaryTree.exceptions.ChildNotFoundException;

import java.util.Arrays;

public class Tree implements BinaryTree{
    public Node root;
    public int elementNum = 0;

    public Tree(int[] array){
        this.root = new Node(array[0]);
        elementNum++;
        addElements(Arrays.copyOfRange(array, 1, array.length));
    }

    public Tree(int rootVal){
        this.root = new Node(rootVal);
        elementNum++;
    }

    public int getRootElement(){
        return root.value;
    }

    public int getNumberOfElements(){
        return elementNum;
    }

    public void addElement(int element){
        Node childNode = new Node(element);
        root.addChild(childNode);
        elementNum++;
    }

    public void addElements(int[] elements){
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    public boolean findElement(int value){
        return root.hasValue(value);
    }

    public int getLeftChild(int element) throws ChildNotFoundException {

    }

    public int getRightChild(int element) throws ChildNotFoundException{

    }

    public int[] getSortedTreeAsc(){

        return null;
    }

    public int[] getSortedTreeDesc(){

        return null;
    }
}
