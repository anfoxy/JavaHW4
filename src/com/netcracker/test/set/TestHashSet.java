package com.netcracker.test.set;

import com.netcracker.test.set.TestSetInt;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class TestHashSet implements TestSetInt {
    final int MILLION = 1_000_000;
    final int ONE_HUNDRED_THOUSAND = 100_000;

    private HashSet<Integer> addList(int s){
        HashSet<Integer> list = new HashSet<>();
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
        HashSet<Integer> list = new HashSet<>();
        Instant startM = Instant.now();
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        HashSet<Integer> list = addList(MILLION);
        long time = timer(() -> list.contains(10), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testContainsMid() {
        HashSet<Integer> list = addList(MILLION);
        long time = timer(() ->   list.contains(500_000), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testContainsLast() {
        HashSet<Integer> list = addList(MILLION);
        long time = timer(() -> list.contains(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testRemoveFirst() {
        HashSet<Integer> list = addList(MILLION);
        long time = timer(() ->  list.remove(0), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveMid() {
        HashSet<Integer> list = addList(MILLION);
        long time = timer(() ->   list.remove(450_000), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveLast() {
        HashSet<Integer> list = addList(MILLION);
        long time = timer(() ->  list.remove(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }

}
