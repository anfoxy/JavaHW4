package com.netcracker.test.map;

import com.netcracker.test.list.TestListInt;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

public class TestHashMap implements TestMapInt {

    @Override
    public long testAdd() {
        HashMap<Integer, String> list = new HashMap<>();
        Instant startM = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.put(i,"s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
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
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.get(450_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetLast() {
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
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
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
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
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
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
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsFirst() {
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.containsKey(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsMid() {
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.containsKey(450_000);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsLast() {
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 1000_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 100000; i++) {
            list.containsKey(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testContainsValue() {
        HashMap<Integer, String> list = new HashMap<>();
        for (int i = 0; i < 100_000; i++) {
            list.put(i,"s"+i);
        }
        Instant startM = Instant.now();
        for (int i = 0; i < 10000; i++) {
            list.containsValue("s"+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }
}
