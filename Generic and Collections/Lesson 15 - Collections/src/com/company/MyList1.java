package com.company;

/**
 * Created by eladlavi on 17/08/2016.
 */
public class MyList1 implements Listable {

    private int[] nums;
    private int pos;


    public MyList1(){
        nums = new int[10];
        pos = 0;

    }

    @Override
    public void add(int num) {
        if(pos == nums.length){//out of space

        }
        nums[pos++] = num;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void addAt(int index, int num) {

    }

    @Override
    public void set(int index, int num) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int indexOf(int num) {
        return 0;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
