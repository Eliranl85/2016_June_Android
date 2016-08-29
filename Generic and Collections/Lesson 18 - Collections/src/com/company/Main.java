package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Iterable - foreach
        //Collection - max()
        //List
        //Set - unique, SortedSet, NavigableSet
        //Queue, Deque
        //Map, SortedMap, NavigableMap


        List<String> myStrings = new ArrayList<>();
        myStrings.add("Liran");
        myStrings.add("Ben");
        myStrings.add("Loraine");
        myStrings.add("Avishay");
        for (String s : myStrings) {
            //System.out.println(s);
        }
        List<String> myStrings2 = new LinkedList<>();

        Set<String> myString3 = new HashSet<>();
        myString3.add("Liran");
        System.out.println(myString3.contains("Liran"));
        myString3.add("Liran");
        myString3.add("Ben");
        for (String s : myString3) {
            System.out.println(s);
        }

        Set<String> myStrings4 = new TreeSet<>();
        Map<String, String> users = new HashMap<>();
        users.put("avishay", "12345");
        users.put("avishay", "123456");
        System.out.println(users.get("avishay").equals("123456"));

        Queue<Message> q = new PriorityQueue<>();
        q.add(new Message("hi"));
        q.add(new Message("bye"));
        Message m;
        while((m = q.poll()) != null){
            System.out.println(m.text);
        }






    }
}
class Message implements Comparable<Message>{
    String text;
    long timeStamp;

    public Message(String text){
        this.text = text;
        this.timeStamp = System.nanoTime();
    }

    @Override
    public int compareTo(Message o) {
        long delta = o.timeStamp - this.timeStamp;
        System.out.println(delta);
        if(delta > 0)
            return -1;
        else if(delta < 0)
            return 1;
        else
            return 0;
    }
}