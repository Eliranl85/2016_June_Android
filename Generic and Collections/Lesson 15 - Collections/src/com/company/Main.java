package com.company;

public class Main {

    public static void main(String[] args) {
	    MyList1 myList1 = new MyList1();
        myList1.add(100);
        /*
        try {
            myList1.remove(-8);
            System.out.println("after remove");
        }catch (IndexOutOfBoundsException e){
            System.out.println("balgan! " + e.getMessage());
        }catch (Exception e){
            System.out.println("balgan! " + e.getMessage());
        }
        */
        myList1.remove(-8);

        System.out.println("done");
    }
}
