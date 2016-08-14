package com.company;

public class Main {

    public static final String KFAR_SABA = "Kfar Saba";
    public static final int ISRAEL_ESTABLISHMENT_YEAR = 1948;

    public static void main(String[] args) {
        PrinterType p = PrinterType.INKJET;
        if(p == PrinterType.DOTMATRIX){

        }else if(p == PrinterType.LASER){

        }else if(p == PrinterType.THERMAL){

        }

        switch (p){
            case DOTMATRIX:

                break;
            case LASER:

                break;
            case INKJET:

                break;
            case THREE_DIMENSIONS:

                break;
            case THERMAL:

                break;

        }

        int x = 8;
        switch (x){
            case 4:

                break;
            case 5:
                break;
            case 6:
                break;
            default:

                break;
        }

        System.out.println(p.getCapacity());



    }

    public static void foo(int val){

    }
}

enum PrinterType{
    DOTMATRIX(5), INKJET(15), LASER(100), THREE_DIMENSIONS(0), THERMAL(1000);

    private int capacity;

    private PrinterType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}















enum Cities{
    KFAR_SABA, RAANANA, HOD_HASHARON, ASHKELON
}