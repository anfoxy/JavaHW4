package com.netcracker.test.map;

public interface TestMapInt {

    default void mainTestPrint(int s) {
        long resTestAdd = 0;
        long resTestGetFirst = 0;
        long resTestGetMid = 0;
        long resTestGetLast = 0;
        long resTestRemoveFirst = 0;
        long resTestRemoveLast = 0;
        long resTestRemoveMid = 0;
        long resTestContainsFirst = 0;
        long resTestContainsLast = 0;
        long resTestContainsMid = 0;
        long resTestContainsValue = 0;
        int n = 0;
        while (n < s) {
            resTestAdd += testAdd();
            resTestGetFirst += testGetFirst();
            resTestGetMid += testGetMid();
            resTestGetLast += testGetLast();
            resTestRemoveFirst += testRemoveFirst();
            resTestRemoveMid += testRemoveMid();
            resTestRemoveLast += testRemoveLast();
            resTestContainsFirst += testContainsFirst();
            resTestContainsMid += testContainsMid();
            resTestContainsLast += testContainsLast();
            resTestContainsValue += testContainsValue();
            n++;
        }
        System.out.println("resTestAdd: " + resTestAdd / s);
        System.out.println("resTestGetFirst: " + resTestGetFirst / s);
        System.out.println("resTestGetMid: " + resTestGetMid / s);
        System.out.println("resTestGetLast: " + resTestGetLast / s);
        System.out.println("resTestRemoveFirst: " + resTestRemoveFirst / s);
        System.out.println("resTestRemoveMid: " + resTestRemoveMid / s);
        System.out.println("resTestRemoveLast: " + resTestRemoveLast / s);
        System.out.println("resTestContainsFirst: " + resTestContainsFirst / s);
        System.out.println("resTestContainsMid: " + resTestContainsMid / s);
        System.out.println("resTestContainsLast: " + resTestContainsLast / s);
        System.out.println("resTestContainsValue: " + resTestContainsValue / s);
    }

    long testAdd();

    long testGetFirst();

    long testGetMid();

    long testGetLast();

    long testRemoveFirst();

    long testRemoveMid();

    long testRemoveLast();

    long testContainsFirst();

    long testContainsMid();

    long testContainsLast();

    long testContainsValue();
}
