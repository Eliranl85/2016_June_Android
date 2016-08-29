package com.company;

/**
 * Created by eladlavi on 17/08/2016.
 */
public class MyList1<T> implements Listable<T> {

    private T[] nums;
    private int pos;


    public MyList1(){
        nums = (T[]) new Object[10];
        pos = 0;

    }

    @Override
    public void add(T num) {
        makeRoom();
        nums[pos++] = num;
    }

    private void makeRoom(){
        if(pos == nums.length){//out of space
            T[] temp = (T[]) new Object[nums.length * 2];
            for (int i = 0; i < nums.length; i++) {
                temp[i] = nums[i];
            }
            nums = temp;
        }
    }



    @Override
    public void remove(int index) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException("trying to remove at " + index);
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
        pos--;
    }



    @Override
    public void addAt(int index, T num) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException("trying to add at " + index);
        makeRoom();
        for (int i = pos; i > index ; i--) {
            nums[i] = nums[i-1];
        }
        nums[index] = num;
        pos++;
    }

    @Override
    public void set(int index, T num) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException("trying to set at " + index);
        nums[index] = num;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException("trying to get at " + index);
        return nums[index];
    }

    @Override
    public int indexOf(T num) {
        for (int i = 0; i < pos; i++) {
            if(nums[i].equals(num))
                return i;
        }
        return -1;
    }

    @Override
    public T[] toArray() {
        T[] temp = (T[]) new Object[pos];
        for (int i = 0; i < pos; i++) {
            temp[i] = nums[i];
        }
        return temp;
    }

    @Override
    public String toString() {
        if(pos == 0)
            return "{}";
        String s = "{";

        for (int i = 0; i < pos - 1; i++) {
            s += nums[i] + ",";
        }
        s += nums[pos - 1];
        s += "}";
        return s;
    }

    @Override
    public int size() {
        return pos;
    }
}
