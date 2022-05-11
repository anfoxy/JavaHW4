package com.netcracker.test.list;

import com.netcracker.mylist.MyLinkedList;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedList;

public class TestMyLinkedList implements TestListInt {


    final int MILLION = 1_000_000;
    final int ONE_HUNDRED_THOUSAND = 100_000;
    final int TEN_THOUSAND = 10_000;

    private MyLinkedList<Integer> addList(int s){
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < s; i++) {
            list.add(i);
        }
        return  list;
    }

    private long timer(Runnable method, int size) {
        Instant startM = Instant.now();
        for (int i = 0; i < size; i++) {
            method.run();
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }
    @Override
    public long testAdd() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Instant startM = Instant.now();
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        MyLinkedList<Integer> list = addList(MILLION);
        long time = timer(() -> list.get(10), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testGetMid() {
        MyLinkedList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.get(50_000), TEN_THOUSAND);
        return time;
    }

    @Override
    public long testGetLast() {
        MyLinkedList<Integer> list = addList(MILLION);
        long time = timer(() -> list.get(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveFirst() {
        MyLinkedList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.remove(0), TEN_THOUSAND);
        return time;

    }

    @Override
    public long testRemoveMid() {
        MyLinkedList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.remove(50_000), TEN_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveLast() {
        MyLinkedList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.remove(list.size()-1), TEN_THOUSAND);
        return time;
    }

    @Override
    public long testAddValue() {
        MyLinkedList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.add(5, 5), TEN_THOUSAND);
        return time;

    }

}
