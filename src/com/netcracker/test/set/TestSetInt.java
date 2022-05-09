package com.netcracker.test.set;

public interface TestSetInt {

    default void mainTestPrint(int s) {

        long resTestAdd = 0;
        long resTestContainsFirst = 0;
        long resTestContainsMid = 0;
        long resTestContainsLast = 0;
        long resTestRemoveFirst = 0;
        long resTestRemoveLast = 0;
        long resTestRemoveMid = 0;
        int n = 0;
        while (n < s) {
            resTestAdd += testAdd();
            resTestContainsFirst += testContainsFirst();
            resTestContainsMid += testContainsMid();
            resTestContainsLast += testContainsLast();
            resTestContainsLast += testContainsLast();
            resTestRemoveFirst += testRemoveFirst();
            resTestRemoveMid += testRemoveMid();
            resTestRemoveLast += testRemoveLast();
            n++;
        }

        System.out.println("resTestAdd: " + resTestAdd/s);
        System.out.println("resTestContainsFirst: " + resTestContainsFirst/s);
        System.out.println("resTestContainsMid: " + resTestContainsMid/s);
        System.out.println("resTestContainsLast: " + resTestContainsLast/s);
        System.out.println("resTestRemoveFirst: " + resTestRemoveFirst/s);
        System.out.println("resTestRemoveMid: " + resTestRemoveMid/s);
        System.out.println("resTestRemoveLast: " + resTestRemoveLast/s);
    }

    long testAdd();

    long testContainsFirst();

    long testContainsMid();

    long testContainsLast();

    long testRemoveFirst();

    long testRemoveMid();

    long testRemoveLast();

}
