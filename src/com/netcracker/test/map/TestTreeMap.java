package com.netcracker.test.map;

import java.time.Duration;
import java.time.Instant;
import java.util.TreeMap;

public class TestTreeMap implements TestMapInt {
    final int MAX_NUMBER_OF_ELEMENTS = 1_000_000;
    final int MID_NUMBER_OF_ELEMENTS = 100_000;
    final int MIN_NUMBER_OF_ELEMENTS = 10_000;

    private TreeMap<Integer, String> addList(int s){
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < s; i++) {
            list.put(i,"s"+i);
        }
        return  list;
    }
    @Override
    public long testAdd() {
        TreeMap<Integer, String> list = new TreeMap<>();
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.put(i,"s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.get(10);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetMid() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.get(450000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetLast() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.get(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveFirst() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.remove(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveMid() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.remove(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.containsKey(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsMid() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.containsKey(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsLast() {
        TreeMap<Integer, String> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.containsKey(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsValue() {
        TreeMap<Integer, String> list = addList(MID_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.containsValue("s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }


}
