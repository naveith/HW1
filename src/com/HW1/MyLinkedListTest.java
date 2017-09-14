package com.HW1;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MyLinkedListTest extends TestCase {

    public void testNextPass() throws Exception {
        ILinkedList<Integer> list = new MyLinkedList<>();
        ILinkedList<Integer> expected = null;
        ILinkedList<Integer> actual = list.next();
        Assert.assertEquals(expected, actual);
    }
    /*
    public void testNextFail() throws Exception {
        ILinkedList<Integer> list = new MyLinkedList<>();
        ILinkedList<Integer> expected = null;
        ILinkedList<Integer> actual = list.next();
        Assert.assertEquals(expected, actual);
    }
    */

    /*
    public void testLast() throws Exception {
    }

    public void testAfter() throws Exception {
    }

    public void testDetach() throws Exception {
    }

    public void testGet() throws Exception {
    }

    public void testSet() throws Exception {
    }

    public void testSetNext() throws Exception {
    }

    public void testAppend() throws Exception {
    }

    public void testInsert() throws Exception {
    }
    */

}