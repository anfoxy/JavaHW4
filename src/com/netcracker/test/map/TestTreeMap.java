package com.netcracker.test.map;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class TestTreeMap implements TestMapInt {
    final int MILLION = 1_000_000;
    final int ONE_HUNDRED_THOUSAND = 100_000;
    final int TEN_THOUSAND = 10_000;

    private TreeMap<Integer, String> addList(int s){
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < s; i++) {
            list.put(i,"s"+i);
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
        TreeMap<Integer, String> list = new TreeMap<>();
        Instant startM = Instant.now();
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            list.put(i,"s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() -> list.get(10), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testGetMid() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() ->  list.get(500_000), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testGetLast() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() ->  list.get(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testRemoveFirst() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() -> list.remove(0), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testRemoveMid() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() -> list.remove(450_000), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testRemoveLast() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() -> list.remove(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testContainsFirst() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() -> list.containsKey(0), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testContainsMid() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() ->  list.containsKey(450_000), ONE_HUNDRED_THOUSAND);
        return time;
    }

    @Override
    public long testContainsLast() {
        TreeMap<Integer, String> list = addList(MILLION);
        long time = timer(() ->   list.containsKey(list.size()-1), ONE_HUNDRED_THOUSAND);
        return time;

    }

    @Override
    public long testContainsValue() {
        TreeMap<Integer, String> list = addList(ONE_HUNDRED_THOUSAND);
        long time = timer(() -> list.containsValue("s"+50_000), TEN_THOUSAND);
        return time;

    }


}
