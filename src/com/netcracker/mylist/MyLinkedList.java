package com.netcracker.mylist;
import java.util.*;
public class MyLinkedList<E> implements ILinkedList<E>{
    transient int size = 0;
    transient MyLinkedList.Node<E> first;
    transient MyLinkedList.Node<E> last;


    private void linkLast(E e) {
        final MyLinkedList.Node<E> l = last;
        final MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    private void linkBefore(E e, MyLinkedList.Node<E> succ) {
        final MyLinkedList.Node<E> pred = succ.prev;
        final MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    @Override
    public void add(E e) {
        linkLast(e);
    }

    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    @Override
    public void clear() {

        for (MyLinkedList.Node<E> x = first; x != null; ) {
            MyLinkedList.Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;

    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    private boolean isPositionIndex(int index) {return index >= 0 && index <= size;}
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(index);
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(index);
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;

    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (MyLinkedList.Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (MyLinkedList.Node<E> x = first; x != null; x = x.next) {
                if (element.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    private E unlink(MyLinkedList.Node<E> x) {
        final E element = x.item;
        final MyLinkedList.Node<E> next = x.next;
        final MyLinkedList.Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        MyLinkedList.Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    @Override
    public int size() {return size;}


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {

            Object[] result = new Object[size];
            int i = 0;
            for (MyLinkedList.Node<E> x = first; x != null; x = x.next)
                result[i++] = x.item;
            return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (MyLinkedList.Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            int cursor = 0;

            int lastRet = -1;
            public boolean hasNext() {
                return cursor != size;
            }

            public E next() {
                int i = cursor;
                E next = get(i);
                lastRet = i;
                cursor = i + 1;
                return next;
            }
        };
    }

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    private MyLinkedList.Node<E> node(int index) {

        if (index < (size >> 1)) {
            MyLinkedList.Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            MyLinkedList.Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
