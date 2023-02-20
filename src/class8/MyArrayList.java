package class8;

import java.util.Arrays;

public class MyArrayList <T> implements MyList <T> {

    private Object[] array;
    private int size = 0;
    private final int myCapacity = 10;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        for (Object a : array) {
            return a.equals(value);
        }
        return false;
    }

    @Override
    public boolean add(T value) {
            if (array.length == size) {
                expendArray();
            }
            if (value == null)
                return false;
            array[size] = value;
            size++;
            return true;
    }

    @Override
    public boolean add(int index, T value) {
            if (array.length == size) {
                expendArray();
            }
            if (index > size - 1 || index < 0 || value == null)
                return false;
            System.arraycopy(array, index, array, index + 1, size - index);
                array[index] = value;
                size++;
                return true;
        }

    @Override
    public boolean remove(Object value) {
        for(int i = 0; i < array.length; i++){
            if (array[i] == (T) value) {
                System.arraycopy(array, i + 1, array, i, size - i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        Object [] addArray = value.toArray();
        int newLength = array.length + addArray.length;
        if (newLength > array.length) {
            expendArray();
        }
        if (addArray.length == 0)
            return false;
        System.arraycopy(addArray, 0, array, size, addArray.length);
        size += addArray.length;
        return true;
    }

    @Override
    public T get(int index) {
        return (T) array [index];
    }

    @Override
    public T remove(int index) {
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return (T) array [index];
    }

    @Override
    public T set(int index, T value) {
        array [index] = value;
        return value;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array [i].equals(value))
                return i;
        }
        return -1;
    }

    private void expendArray() {
        array = Arrays.copyOf(array, array.length * 3 / 2 + 1);
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public MyArrayList() {
        this.array = new Object[myCapacity];
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
    }

    public MyArrayList(MyList<? extends T> col) {
        if (col.size() > 0) {
            array = col.toArray();
            size = array.length;
            if (myCapacity <= size) {
                expendArray();
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == null) {
                array[i] = "";
            }
        }
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}