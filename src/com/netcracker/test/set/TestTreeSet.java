package com.netcracker.test.set;

import com.netcracker.test.set.TestSetInt;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet implements TestSetInt {
    final int MILLION = 1_000_000;
    final int ONE_HUNDRED_THOUSAND = 100_000;

    private TreeSet<Integer> addList(int s){
        TreeSet<Integer> list = new TreeSet<>();
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
        TreeSet<Integer> list = new TreeSet<>();
        Instant startM = Instant.now();
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        TreeSet<Integer> list = addList(MILLION);
        long time = timer(() ->  list.contains(10), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testContainsMid() {
        TreeSet<Integer> list = addList(MILLION);
        long time = timer(() ->  list.contains(500_000), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testContainsLast() {
        TreeSet<Integer> list = addList(MILLION);
        long time = timer(() ->   list.contains(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveFirst() {
        TreeSet<Integer> list = addList(MILLION);
        long time = timer(() ->  list.remove(0), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveMid() {
        TreeSet<Integer> list = addList(MILLION);
        long time = timer(() ->  list.remove(450_000), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveLast() {
        TreeSet<Integer> list = addList(MILLION);
        long time = timer(() -> list.remove(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }



}
