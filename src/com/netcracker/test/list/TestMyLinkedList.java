package com.netcracker.test.list;

import com.netcracker.mylist.MyLinkedList;
import java.time.Duration;
import java.time.Instant;

public class TestMyLinkedList implements TestListInt {



    @Override
    public long testAdd() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 1000_000; i++) {
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
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 100_000; i++) {
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
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 1000_000; i++) {
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
        MyLinkedList<Integer> list = new MyLinkedList<>();
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
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10_000; i++) {
            list.remove(45_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 100_000; i++) {
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
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.add(i + i, i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

}
