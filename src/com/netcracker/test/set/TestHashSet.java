package com.netcracker.test.set;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;

public class TestHashSet implements TestSetInt {
    final int MAX_NUMBER_OF_ELEMENTS = 1_000_000;
    final int MIN_NUMBER_OF_ELEMENTS = 100_000;

    private HashSet<Integer> addList(int s){
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < s; i++) {
            list.add(i);
        }
        return  list;
    }
    @Override
    public long testAdd() {
        HashSet<Integer> list = new HashSet<>();
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        HashSet<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);

        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.contains(10);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsMid() {
        HashSet<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.contains(450_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsLast() {
        HashSet<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.contains(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveFirst() {
        HashSet<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.remove(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveMid() {
        HashSet<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.remove(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        HashSet<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

}
