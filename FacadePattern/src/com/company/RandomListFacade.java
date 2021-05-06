package com.company;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;

    public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList, RandomNumber randomNumber) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
        this.randomNumber = randomNumber;
    }

    public RandomListFacade() {
    }

    public void  printRandomEvenList(int size, int min, int max){
        List<Integer> numbers = randomList.generateList(size,min,max);
        List<Integer> newList = listFilter.filterOdd(numbers);
        listPrinter.printList(newList);
    }

}
