package com.company;

/**
 * Created by eladlavi on 17/08/2016.
 */
public interface Listable<T> {

    void add(T num);
    void remove(int index);
    void addAt(int index, T num);
    void set(int index, T num);
    T get(int index);

    //return -1 if num doesn't exist, otherwise returns the
    //first occurrence of num
    int indexOf(T num);
    T[] toArray();
    int size();


}
