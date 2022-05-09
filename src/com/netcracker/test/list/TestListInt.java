package com.netcracker.test.list;

public interface TestListInt {

    default void mainTestPrint(int s) {

        long resTestAdd = 0;
        long resTestGetFirst = 0;
        long resTestGetMid = 0;
        long resTestGetLast = 0;
        long resTestRemoveFirst = 0;
        long resTestRemoveLast = 0;
        long resTestRemoveMid = 0;
        long resTestAddValue = 0;
        int n = 0;

        while (n < s) {
            resTestAdd += testAdd();
            resTestGetFirst += testGetFirst();
            resTestGetMid += testGetMid();
            resTestGetLast += testGetLast();
            resTestRemoveFirst += testRemoveFirst();
            resTestRemoveMid += testRemoveMid();
            resTestRemoveLast += testRemoveLast();
            resTestAddValue += testAddValue();
            n++;
        }
        System.out.println("resTestAdd: " + resTestAdd/ s);
        System.out.println("resTestGetFirst: " + resTestGetFirst/ s);
        System.out.println("resTestGetMid: " + resTestGetMid/ s);
        System.out.println("resTestGetLast: " + resTestGetLast/ s);
        System.out.println("resTestRemoveFirst: " + resTestRemoveFirst/ s);
        System.out.println("resTestRemoveMid: " + resTestRemoveMid/ s);
        System.out.println("resTestRemoveLast: " + resTestRemoveLast/ s);
        System.out.println("resTestAddValue: " + resTestAddValue/ s);
    }

    long testAdd();

    long testGetFirst();

    long testGetMid();

    long testGetLast();

    long testRemoveFirst();

    long testRemoveMid();

    long testRemoveLast();

    long testAddValue();

}
