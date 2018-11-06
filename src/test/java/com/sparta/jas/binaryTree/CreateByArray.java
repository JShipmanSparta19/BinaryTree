package com.sparta.jas.binaryTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CreateByArray {

    private Tree arrayTree;
    private int[] setupArr;
    private Random random = new Random();

    @Before
    public void classSetup(){
        setupArr = new int[random.nextInt(10)+5];
        for (int i = 0; i < setupArr.length; i++) {
            setupArr[i] = random.nextInt(100) + 1;
        }
        arrayTree = new Tree(setupArr);
    }

    @Test
    public void rootTest(){
        Assert.assertEquals(setupArr[0], arrayTree.getRootElement());
    }

    @Test
    public void sizeTest(){
        Assert.assertEquals(setupArr.length, arrayTree.getNumberOfElements());
    }

    @Test
    public void expandTest(){
        int[] expansionArr = new int[random.nextInt(10)+5];
        for (int i = 0; i < expansionArr.length; i++) {
            expansionArr[i] = random.nextInt(100) + 1;
        }
        arrayTree.addElements(expansionArr);
        Assert.assertEquals(setupArr.length + expansionArr.length, arrayTree.getNumberOfElements());
    }

    @Test
    public void findElementTrue(){
        Assert.assertTrue(arrayTree.findElement(setupArr[4]));
    }

    @Test
    public void findElementFalse(){
        Assert.assertFalse(arrayTree.findElement(200));
    }
}
