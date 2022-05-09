package com.netcracker.test.list;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class TestLinkedList implements TestListInt {

    @Override
    public long testAdd() {
        LinkedList<Integer> list = new LinkedList<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.get(10);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetMid() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.get(49000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetLast() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.get(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveFirst() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveMid() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.remove(45_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testAddValue() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.add(i+i,i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

}
