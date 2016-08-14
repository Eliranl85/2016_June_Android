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

        



    }
}

enum PrinterType{
    DOTMATRIX, INKJET, LASER, THREE_DIMENSIONS, THERMAL
}

enum Cities{
    KFAR_SABA, RAANANA, HOD_HASHARON, ASHKELON
}