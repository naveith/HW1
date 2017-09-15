package com.HW1;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class MyLinkedListTest extends TestCase {

    public void testNextFail() throws Exception {
        System.out.println("Test next() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        two.insert(one);
        try {
            two.next().next();
        } catch (NullPointerException expected){
            System.out.println("warning: \"null\" does not have a next.");
        }
    }

    public void testNextEmptyPass() throws Exception {
        System.out.println("Test Empty next() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> expected = null;
        ILinkedList<Integer> actual = one.next();
        Assert.assertEquals(expected, actual);
    }


    public void testLastPopulatedFail() throws Exception {
        System.out.println("Test Populated last() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        two.insert(one);
        two.set(2);
        try {
            System.out.println(two.last().get());
        } catch (NullPointerException expected){
            System.out.println("warning: \"null\" does not have a last.");
        }
    }

    public void testLastEmptyFail() throws Exception {
        System.out.println("Test Empty last() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        try {
            one.last();
        } catch (NullPointerException expected){
            System.out.println("warning: \"null\" does not have a last.");
        }
    }

    public void testLastPopulatedPass() throws Exception {
        System.out.println("Test Populated last() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        two.insert(one);
        two.set(2);
        int expected = 2;
        int actual = one.last().get();
        Assert.assertEquals(expected, actual);
    }

    public void testAfterFail() throws Exception {
        System.out.println("Test populated after() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        three.set(3);
        one.setNext(two);
        two.setNext(three);
        try{
            one.after(3).get();
        } catch (NullPointerException expected){
            System.out.println("warning: \"null\" does not have an after.");
        }
    }

    public void testAfterPass() throws Exception {
        System.out.println("Test Populated after() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        three.set(3);
        one.setNext(two);
        two.setNext(three);
        int expected = 3;
        int actual = one.after(2).get();
        Assert.assertEquals(expected, actual);
    }

    public void testDetachFail() throws Exception {
        System.out.println("Test Populated detach() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        three.set(3);
        three.insert(two);
        two.insert(one);
        one.detach();
        try {
            one.next().get();
        } catch (NullPointerException expected) {
            System.out.println("warning: cannot access detached lists");
        }
    }

    public void testDetachPass() throws Exception {
        System.out.println("Test Populated detach() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        three.set(3);
        three.insert(two);
        two.insert(one);
        two.detach();
        int expected = 2;
        int actual = one.last().get();
        Assert.assertEquals(expected, actual);
    }

    public void testGetFail() throws Exception {
        System.out.println("Test get() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        two.insert(one);
        try {
            System.out.println(two.next().get());
        } catch (NullPointerException expected) {
            System.out.println("warning: cannot get out of bounds value.");
        }
    }

    public void testGetPass() throws Exception {
        System.out.println("Test get() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        one.set(1);
        two.insert(one);
        int expected = 1;
        int actual = one.get();
        Assert.assertEquals(expected, actual);
    }

    public void testSetFail() throws Exception {
        System.out.println("Test set() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        one.set(null);
        //int expected = 1;
        //int actual = one.get();
        //Assert.assertEquals(expected, actual);
    }

    public void testSetPass() throws Exception {
        System.out.println("Test set() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        one.set(1);
        int expected = 1;
        int actual = one.get();
        Assert.assertEquals(expected, actual);
    }

    public void testSetNextFail() throws Exception {
        System.out.println("Test setNext() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        three.set(3);
        one.setNext(two);
        one.setNext(three);
        //int expected = 2;
        //int actual = one.next().get();
        //Assert.assertEquals(expected, actual);
        System.out.println(one.next().get());
    }

    public void testSetNextPass() throws Exception {
        System.out.println("Test setNext() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        one.set(1);
        two.set(2);
        one.setNext(two);
        int expected = 2;
        int actual = one.next().get();
        Assert.assertEquals(expected, actual);
    }

    public void testAppendFail() throws Exception {
        System.out.println("Test setNext() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        ILinkedList<Integer> three = new MyLinkedList<>();
        two.set(2);
        try {
            one.append(null);
        } catch (NullPointerException expected){
            System.out.println("warning: cannot append null");
        }
    }

    public void testAppendPass() throws Exception {
        System.out.println("Test setNext() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        two.set(2);
        try {
            one.append(two);
        } catch (NullPointerException expected){
            System.out.println("append error");
        }
        //int expected = 2;
        //int actual = one.next().get();
        //Assert.assertEquals(expected, actual);
    }

    public void testInsertFail() throws Exception {
        System.out.println("Test insert() Fail");
        ILinkedList<Integer> one = new MyLinkedList<>();
        try {
            one.insert(null);
        } catch(NullPointerException expected){
            System.out.println("warning: cannot insert a null list.");
        }
    }

    //testInsertPass() just so happens to test a populated next().
    public void testInsertPass() throws Exception {
        System.out.println("Test insert() Pass");
        ILinkedList<Integer> one = new MyLinkedList<>();
        ILinkedList<Integer> two = new MyLinkedList<>();
        two.insert(one);
        ILinkedList<Integer> actual = one.next();
        ILinkedList<Integer> expected = two;
        Assert.assertEquals(expected, actual);
    }

}