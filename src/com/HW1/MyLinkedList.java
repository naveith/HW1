package com.HW1;

public class MyLinkedList<T> implements ILinkedList<T> {
    private ILinkedList<T> next;
    private ILinkedList<T> temp;
    private T value;

    /**
     * Get the next list element
     * @return the next element
     */
    public ILinkedList<T> next(){
        return next;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    public ILinkedList<T> last(){
        while (next != null) {
            temp = next;
        }
        return temp;
    }

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    public ILinkedList<T> after(int n){
        for(int i = 0; i < n; i++) {
            temp = next;
        }
        return temp;
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    public ILinkedList<T> detach(){
        setNext(null);
        return next;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    public T get(){
        return value;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    public void set(T value){
        this.value = value;
    }

    /**
     * Sets the next element in the list
     * @param next the next element
     */
    public void setNext(ILinkedList<T> next){
        this.next = next;
    }

    /**
     * Sets the next element after this current element
     * @param next the next element
     */
    public void append(ILinkedList<T> next){
        last().setNext(next);
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     */
    public void insert(ILinkedList<T> newFirst){
        newFirst.setNext(this);
    }
}
