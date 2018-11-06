package com.sparta.jas.binaryTree;

import com.sparta.jas.binaryTree.exceptions.ChildNotFoundException;

public class Node {
    public int value;
    public Node leftChild;
    public Node rightChild;

    public Node(int value){
        this.value = value;
    }



    public void addChild(Node child){
        if (child.value < value){
            if (leftChild != null){
                leftChild.addChild(child);
            } else {
                leftChild = child;
            }
        } else {
            if (rightChild != null){
                rightChild.addChild(child);
            } else {
                rightChild = child;
            }
        }
    }

    public boolean hasValue(int number){
        boolean left = false;
        boolean right = false;
        if (value == number){
            return true;
        } else {
            try {
                left = leftChild.hasValue(number);
            } catch (NullPointerException e){

            }
            try {
                right = rightChild.hasValue(number);
            } catch (NullPointerException e){

            }

            if (left | right){
                return true;
            } else {
                return false;
            }
        }
    }

    public int findLeftChild(int element) throws ChildNotFoundException {
        int foundChildLeft;
        int foundChildRight;
        if(value == element) {
            try {
                return leftChild.value;
            } catch (NullPointerException e) {
                throw new ChildNotFoundException(element, "Left Child");
            }
        } else {
            foundChildLeft = leftChild.findLeftChild(element);
            foundChildRight = rightChild.findLeftChild(element);
            if (foundChildLeft ){

            }
        }
    }

    public int findRightChild(int element){
        rightChild;
    }
}
