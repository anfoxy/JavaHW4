package com.netcracker.test.set;

import com.netcracker.test.set.TestSetInt;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;

public class TestHashSet implements TestSetInt {

    @Override
    public long testAdd() {
        HashSet<Integer> list = new HashSet<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < 1000_000; i++) {
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
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < 1000_000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.contains(450_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsLast() {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < 1000_000; i++) {
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
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < 1000_000; i++) {
            list.add(i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.remove(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveMid() {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < 1000_000; i++) {
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
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < 1000_000; i++) {
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
