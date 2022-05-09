package com.netcracker.test.set;

import com.netcracker.test.set.TestSetInt;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedHashSet;

public class TestLinkedHashSet implements TestSetInt {

    @Override
    public long testAdd() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.contains(10);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsMid() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.contains(450000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }


    @Override
    public long testContainsLast() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.contains(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveFirst() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.remove(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveMid() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.remove(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

}
