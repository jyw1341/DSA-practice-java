package org.dsa.list;

public class MyLinkedList<E> {

    private MyNode<E> tail;
    private MyNode<E> head;

    MyLinkedList() {

    }

    public void add(E element) {
        MyNode<E> previousNode = tail;
        MyNode<E> newNode = new MyNode<>(previousNode, element, null);
        tail = newNode;

        //리스트의 첫번째 노드인 경우
        if (previousNode == null) {
            head = newNode;
            return;
        }

        previousNode.next = newNode;

    }

    private static class MyNode<E> {
        E element;
        MyNode<E> previous;
        MyNode<E> next;

        MyNode(MyNode<E> previous, E element, MyNode<E> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }


}
