package com.company;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by eladlavi on 21/08/2016.
 */
public class MyList2<T> implements  Listable<T>, Iterable<T>, Iterator<T> {

    Link anchor;
    Link last;
    Link current;
    int pos;


    public MyList2(){
        anchor = new Link(null);
        last = anchor;
        pos = 0;
    }


    @Override
    public void add(T num) {
        /*
        Link last = anchor;
        while(last.next != null){
            last = last.next;
        }
        */
        last.next = new Link(num);
        last = last.next;
        pos++;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException();
        Link theOneBefore = anchor;
        for (int i = 0; i < index; i++) {
            theOneBefore = theOneBefore.next;
        }
        theOneBefore.next = theOneBefore.next.next;
        pos--;
    }

    @Override
    public void addAt(int index, T num) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException();
        Link theOneBefore = anchor;
        for (int i = 0; i < index; i++) {
            theOneBefore = theOneBefore.next;
        }
        Link added = new Link(num);
        added.next = theOneBefore.next;
        theOneBefore.next = added;
        pos++;
    }

    @Override
    public void set(int index, T num) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException();
        Link link = anchor;
        for (int i = 0; i <= index; i++) {
            link = link.next;
        }
        link.value = num;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException();
        Link link = anchor;
        for (int i = 0; i <= index; i++) {
            link = link.next;
        }
        return (T) link.value;
    }

    @Override
    public int indexOf(T num) {
        Link a = anchor.next;
        for (int i = 0; i < pos; i++) {
            if(a.value.equals(num))
                return i;
            a = a.next;
        }
        return -1;

        /*
        Link link = anchor;
        int counter = 0;
        while(link.next != null){
            link = link.next;
            if(link.value == num)
                return counter;
            counter++;
        }
        return -1;
         */
    }

    @Override
    public T[] toArray() {
        T[] arr = (T[]) new Object[pos];
        Link link = anchor;
        for (int i = 0; i < pos; i++) {
            link = link.next;
            arr[i] = (T) link.value;
        }
        return arr;
    }


    @Override
    public int size() {
        return pos;
    }



    static class Link<T>{
        T value;
        Link next;

        public Link(T value){
            this.value = value;
        }
    }


    @Override
    public String toString() {
        if(pos == 0){
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Link link = anchor;
        for (int i = 0; i < pos - 1; i++) {
            link = link.next;
            stringBuilder.append(link.value + ",");
        }
        stringBuilder.append(last.value);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


    public void reset(){
        current = anchor;
    }



    /*
    public boolean next(){
        if(current.next == null)
            return false;
        current = current.next;
        return true;
    }
    */

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {

    }

    public T get(){
        return (T) current.value;
    }






    //*************

    @Override
    public Iterator<T> iterator() {
        current = anchor;
        return this;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        System.out.println("in forEach");
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }


    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public T next() {
        current = current.next;
        return (T) current.value;
    }
}


