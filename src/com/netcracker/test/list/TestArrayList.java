package com.netcracker.test.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class TestArrayList implements TestListInt {

    final int MAX_NUMBER_OF_ELEMENTS = 1_000_000;
    final int MID_NUMBER_OF_ELEMENTS = 100_000;
    final int MIN_NUMBER_OF_ELEMENTS = 10_000;

    private ArrayList<Integer> addList(int s){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            list.add(i);
        }
        return  list;
    }
    @Override
    public long testAdd() {
        ArrayList<Integer> list = new ArrayList<>();
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.add(i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetFirst() {
        ArrayList<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.get(10);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetMid() {
        ArrayList<Integer> list = addList(MID_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.get(49000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testGetLast() {
        ArrayList<Integer> list = addList(MAX_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MID_NUMBER_OF_ELEMENTS; i++) {
            list.get(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveFirst() {
        ArrayList<Integer> list = addList(MID_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.remove(0);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveMid() {
        ArrayList<Integer> list = addList(MID_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.remove(45_000+i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testRemoveLast() {
        ArrayList<Integer> list = addList(MID_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.remove(list.size()-1);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

    @Override
    public long testAddValue() {
        ArrayList<Integer> list = addList(MID_NUMBER_OF_ELEMENTS);
        Instant startM = Instant.now();
        for (int i = 0; i < MIN_NUMBER_OF_ELEMENTS; i++) {
            list.add(i+i,i);
        }
        Instant finishM = Instant.now();
        return Duration.between(startM, finishM).toNanos();
    }

}
