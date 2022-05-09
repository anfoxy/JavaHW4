package com.netcracker.test.map;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.TreeMap;

public class TestTreeMap implements TestMapInt {

    @Override
    public long testAdd() {
        TreeMap<Integer, String> list = new TreeMap<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.put(i,"s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.get(10);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetMid() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.get(450000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetLast() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.get(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveFirst() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
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
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.remove(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.containsKey(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsMid() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.containsKey(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsLast() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.containsKey(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsValue() {
        TreeMap<Integer, String> list = new TreeMap<>();
        for (int i = 0; i < 100_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10_000; i++) {
            list.containsValue("s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }


}
