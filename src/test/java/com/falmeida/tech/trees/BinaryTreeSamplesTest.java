package com.falmeida.tech.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeSamplesTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTreeSamples bt = new BinaryTreeSamples();
        bt = bt.createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

}