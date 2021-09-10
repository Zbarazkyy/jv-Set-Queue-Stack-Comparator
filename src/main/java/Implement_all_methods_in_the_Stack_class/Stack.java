package Implement_all_methods_in_the_Stack_class;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> lastNode;
    int size;

    public void push(T value) {
        Node<T> node;
        if (size == 0) {
            node = new Node<>(value, null);
            lastNode = node;
            size++;
            return;
        }
        node = new Node<>(value, lastNode);
        lastNode = node;
        size++;
    }

    public T peek() {
        if (size == 0)
            throw new EmptyStackException();
        return lastNode.value;
    }

    public T pop() {
        if (size == 0)
            throw new EmptyStackException();
        T value = lastNode.value;
        lastNode = lastNode.next;
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        private T getValue() {
            return value;
        }

        private void setValue(T value) {
            this.value = value;
        }

        private Node<T> getNext() {
            return next;
        }

        private void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
