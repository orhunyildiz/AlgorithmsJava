package QueueExample;

import java.util.Arrays;

public class Queue {
    public static final int MAX_QUEUE_SIZE = 5;
    boolean full = false;
    boolean empty = true;
    String[] array = new String[MAX_QUEUE_SIZE];
    int pointer = 0;
    int take = 0;
    int size = 0;

    public boolean queue(String newElement) {
        if (!full) {
            array[pointer] = newElement;
            pointer++;
            size++;
            empty = false;
            if (pointer == MAX_QUEUE_SIZE)
                full = true;
            return true;
        }
        else
            return false;
    }

    public String dequeue() {
        String firstItem = null;
        if (!empty) {
            firstItem = array[take];
            array[take] = null;
            take++;
            size--;
            pointer--;
            if (take != 0)
                full = false;
            if (take == MAX_QUEUE_SIZE)
                empty = true;
        }
        return firstItem;
    }

    public void clear() {
        Arrays.fill(array, null);
        pointer = 0;
        take = 0;
        size = 0;
        empty = true;
        full = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isFull() {
        return full;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return MAX_QUEUE_SIZE;
    }

    public void showElements() {
        System.out.println("*** Elements in the Queue ***");
        if (!empty) {
            for (String s : array) {
                if (s != null)
                    System.out.println(s);
            }
        }
        else
            System.out.println("Nothing in the Queue!");
    }
}
