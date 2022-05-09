package com.netcracker.mylist;

public interface ILinkedList<E> extends Iterable<E>{

    void add(E e);
    void add(int index, E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    E set(int index, E element);
    int size();
    boolean isEmpty();
    Object[] toArray();

    <E> E[] toArray(E[] a);

    String toString();

}
