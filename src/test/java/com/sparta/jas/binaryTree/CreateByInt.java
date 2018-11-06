package com.sparta.jas.binaryTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CreateByInt {

    private Tree intTree;
    private int setupNo;
    private Random random = new Random();

    @Before
    public void classSetup(){
        setupNo = random.nextInt(100)+1;
        intTree = new Tree(setupNo);
    }

    @Test
    public void rootTest(){
        Assert.assertEquals(setupNo, intTree.getRootElement());
    }

    @Test
    public void sizeTest(){
        Assert.assertEquals(1, intTree.getNumberOfElements());
    }

    @Test
    public void expandTest(){
        intTree.addElement(random.nextInt(setupNo - 1) + 1);
        intTree.addElement(random.nextInt(100 - setupNo) + setupNo + 1);
        Assert.assertEquals(3, intTree.getNumberOfElements());
    }
}
