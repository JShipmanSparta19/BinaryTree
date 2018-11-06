package com.sparta.jas.binaryTree;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FixedArrayTests {
    private Tree arrayTree;
    private int[] setupArr = new int[]{5,6,3,9,8,1,4,10};

    @BeforeClass
    public void classSetup(){
        arrayTree = new Tree(setupArr);
    }

    @Test
    public void leftChildTest(){
        Assert.assertTrue(arrayTree.getLeftChild(9), 8);
    }

    @Test
    public void rightChildTest(){

    }

    @Test
    public void leftChildFail(){

    }

    @Test
    public void rightChildFail(){

    }

    @Test
    public void leftNoParent(){

    }

    @Test
    public void rightNoParent(){

    }
}
