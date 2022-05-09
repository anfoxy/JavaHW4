package com.netcracker.test.map;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestLinkedHashMap implements TestMapInt {

    @Override
    public long testAdd() {
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.put(i,"s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.get(450_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetLast() {
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
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
