/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence;



/**
 *
 * @author B00316640
 */
public class ArraySequence<E> implements Sequence<E> {

    protected E[] data;
    protected int size;

    public ArraySequence() {
        this(16);
    }

    public ArraySequence(int capacity) {
        this.data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * Returns the number of elements in this Sequence object.
     *
     * @return the number of elements in this Sequence object.
     */
    @Override
    public int size() {

        return size;
    }

    /**
     * Appends a specified element to this Sequence object.
     *
     * @param element - the element to be inserted at the end of this Sequence
     * object.
     */
    @Override
    public void append(E element) {
        data[size++] = element;
    }

    /**
     * Returns the element at a specified index in this Sequence object.
     *
     * @param k - the index of the element returned.
     *
     * @return the element at index k in this Sequence object.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than or equal to the number of elements in this Sequence object.
     */
    @Override
    public E get(int k) {

        return this.data[k];
    }

    /**
     * Changes the element at a specified index in this Sequence object.
     *
     * @param k - the index of the element required.
     * @param newElement - the element to replace the element at index k in this
     * Sequence object.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than or equal to the number of elements in this Sequence object.
     */
    @Override
    public void set(int k, E newElement) {
        this.data[k] = newElement;
    }

    /**
     * Inserts the specified element at the specified position in this sequence.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * @param k - the index at which the element is to be inserted.
     * @param element - the element to be inserted.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than the number of elements in this Sequence object.
     */
    public void add(int k, E element) {
        if(get(k) == null){
            this.data[k] = element;
        } else {
            
        }
        
  
        size++;
        
        
    }
    
  

    /**
     * Removes the element at a specified index in this Sequence object and
     * returns it. Shifts any subsequent elements to the left (subtracts one
     * from their indices).
     *
     * @param k - the index of the element to be removed.
     *
     * @return the element that was at index k in this Sequence object.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than or equal to the number of elements in this Sequence object.
     */
    public E remove(int k) {

        
        if(get(k)!= null){
         this.data[k] = null;
         size--;
        }
        else{
            System.out.println("THERE ARE NO ELEMENTS");
        }
        return (E) this;
    }


    /**
     * display all the elements in the sequence object
     */
    public void display() {
        for (E e : data) {
            if (e != null) {
                System.out.println(e);
            } else {
                break;
            }
        }
    }

    
}
