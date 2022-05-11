package com.netcracker.test.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class TestArrayList implements TestListInt {

    final int MILLION = 1_000_000;
    final int ONE_HUNDRED_THOUSAND = 100_000;
    final int TEN_THOUSAND = 10_000;

    private ArrayList<Integer> addList(int s){
        ArrayList<Integer> list = new ArrayList<>();
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
        ArrayList<Integer> list = new ArrayList<>();
        Instant startM = Instant.now();
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        ArrayList<Integer> list = addList(MILLION);
        long time = timer(() -> list.get(10), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testGetMid() {
        ArrayList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.get(50_000), TEN_THOUSAND);
        return time;
    }

    @Override
    public long testGetLast() {
        ArrayList<Integer> list = addList(MILLION);
        long time = timer(() -> list.get(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveFirst() {
        ArrayList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.remove(0), TEN_THOUSAND);
        return time;

    }

    @Override
    public long testRemoveMid() {
        ArrayList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.remove(50_000), TEN_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveLast() {
        ArrayList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.remove(list.size()-1), TEN_THOUSAND);
        return time;
    }

    @Override
    public long testAddValue() {
        ArrayList<Integer> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.add(5, 5), TEN_THOUSAND);
        return time;

    }
}
