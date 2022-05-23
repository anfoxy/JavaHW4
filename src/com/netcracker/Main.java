package com.netcracker;

import com.netcracker.mylist.MyLinkedList;
import com.netcracker.test.list.TestArrayList;
import com.netcracker.test.list.TestLinkedList;
import com.netcracker.test.list.TestMyLinkedList;
import com.netcracker.test.map.TestHashMap;
import com.netcracker.test.map.TestLinkedHashMap;
import com.netcracker.test.map.TestTreeMap;
import com.netcracker.test.set.TestHashSet;
import com.netcracker.test.set.TestLinkedHashSet;
import com.netcracker.test.set.TestTreeSet;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TestTreeSet testTreeSet = new TestTreeSet();

        System.out.println(testTreeSet.test());
        System.out.println(testTreeSet.testRemoveLast());

        /*
        testMyLinkedList();
        TestLinkedList testLinkedList = new TestLinkedList();
        TestMyLinkedList testMyLinkedList = new TestMyLinkedList();
        TestArrayList testArrayList = new TestArrayList();

        TestHashSet testHashSet = new TestHashSet();
        TestLinkedHashSet testLinkedHashSet = new TestLinkedHashSet();
        TestTreeSet testTreeSet = new TestTreeSet();

        TestHashMap testHashMap = new TestHashMap();
        TestLinkedHashMap testLinkedHashMap = new TestLinkedHashMap();
        TestTreeMap testTreeMap = new TestTreeMap();

        System.out.println("testMyLinkedList run=========");
        testMyLinkedList.mainTestPrint(20);
        System.out.println("testMyLinkedList end=========");

        System.out.println("testLinkedList run===========");
        testLinkedList.mainTestPrint(20);
        System.out.println("testLinkedList end===========");

        System.out.println("testArrayList run=========");
        testArrayList.mainTestPrint(20);
        System.out.println("testArrayList end=========");

        System.out.println("testHashSet run=========");
        testHashSet.mainTestPrint(20);
        System.out.println("testHashSet end=========");

        System.out.println("testLinkedHashSet run=========");
        testLinkedHashSet.mainTestPrint(20);
        System.out.println("testLinkedHashSet end=========");

        System.out.println("testTreeSet run=========");
        testTreeSet.mainTestPrint(20);
        System.out.println("testTreeSet end=========");

        System.out.println("testHashMap run=========");
        testHashMap.mainTestPrint(20);
        System.out.println("testHashMap end=========");

        System.out.println("testLinkedHashMap run=========");
        testLinkedHashMap.mainTestPrint(20);
        System.out.println("testLinkedHashMap end=========");

        System.out.println("testTreeMap run=========");
        testTreeMap.mainTestPrint(20);
        System.out.println("testTreeMap end=========");*/
    }

    public static void testMyLinkedList(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("==========test toString==========");
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        System.out.println("==========test add==========");
        linkedList.add(2,5);
        myLinkedList.add(2,5);
        System.out.println(linkedList);
        System.out.println(myLinkedList);

        linkedList.add(1,8);
        myLinkedList.add(1,8);
        System.out.println(linkedList);
        System.out.println(myLinkedList);

        System.out.println("==========test get==========");
        System.out.println(myLinkedList.get(0));
        System.out.println(linkedList.get(0));

        System.out.println(myLinkedList.get(2));
        System.out.println(linkedList.get(2));

        System.out.println("==========test remove==========");
        System.out.println(myLinkedList.remove(3));
        System.out.println(linkedList.remove(3));
        System.out.println(linkedList);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(2));
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList);
        System.out.println(myLinkedList);
        System.out.println("==========test set==========");
        System.out.println(myLinkedList.set(2,7));
        System.out.println(linkedList.set(2,7));
        System.out.println(linkedList);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.set(1,6));
        System.out.println(linkedList.set(1,6));
        System.out.println(linkedList);
        System.out.println(myLinkedList);
        System.out.println("==========test indexOf==========");
        System.out.println(myLinkedList.indexOf(2));
        System.out.println(linkedList.indexOf(2));

        System.out.println(myLinkedList.indexOf(7));
        System.out.println(linkedList.indexOf(7));

        System.out.println(myLinkedList.indexOf(1));
        System.out.println(linkedList.indexOf(1));

        System.out.println("==========test clear==========");
        myLinkedList.clear();
        linkedList.clear();
        System.out.println(linkedList);
        System.out.println(myLinkedList);
        System.out.println("==========test isEmpty==========");
        System.out.println(myLinkedList.isEmpty());
        System.out.println(linkedList.isEmpty());

        myLinkedList.add(3);
        linkedList.add(3);

        System.out.println(myLinkedList.isEmpty());
        System.out.println(linkedList.isEmpty());
    }
}
