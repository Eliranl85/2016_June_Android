package com.company;

public class Main {

    public static void main(String[] args) {
	    MyList2 myList2 = new MyList2();
        myList2.add(100);
        myList2.add(200);
        myList2.add(400);
        myList2.add(600);
        myList2.addAt(1,150);
        System.out.println(myList2);
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
        //myList1.remove(-8);

        //System.out.println("done");
    }
}
