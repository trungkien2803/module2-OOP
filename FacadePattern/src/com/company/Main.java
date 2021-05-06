package com.company;

public class Main {

    public static void main(String[] args) {
            RandomListFacade randomListFacade = new RandomListFacade(new ListFilter(),new ListPrinter(), new RandomList(), new RandomNumber());
            randomListFacade.printRandomEvenList(20,1,1000);
    }
}
