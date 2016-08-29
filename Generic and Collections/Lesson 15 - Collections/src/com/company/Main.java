package com.company;

public class Main {

    public static void main(String[] args) {
	    MyList2<Integer> myList2 = new MyList2<>();
        myList2.add(100);
        myList2.add(200);
        myList2.add(400);
        myList2.add(600);
        myList2.addAt(1,150);
        System.out.println(myList2);


        int sum = 0;
        /*for (int i = 0; i < myList2.size(); i++) {
            sum += (Integer)myList2.get(i);
        }*/
        /*myList2.reset();
        while(myList2.next())
            sum += myList2.get();*/
        for(Integer i : myList2){
            sum += i;
        }

        System.out.println(sum);

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
