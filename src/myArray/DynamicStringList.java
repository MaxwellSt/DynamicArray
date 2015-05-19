package myArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Макс on 19.05.2015.
 */
public class DynamicStringList<S> implements SimpleList {

    private static String[] stringArray;
    private static final int DEFAULT_LENGHT = 5;
    private int size;

    //2 конструктора: а)пустой и б) с числовым аргументом, определяющим начальный размер массива для хранения строк.

    public DynamicStringList() {

        this.stringArray = new String[DEFAULT_LENGHT];
    }

    public DynamicStringList(int Capacity) {
        if (Capacity > 0) {
            this.stringArray = new String[Capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    Capacity);
        }
    }

    public void add(String s) {
        ensureCapacityInternal(size + 1);  // проверим емкость массива
        stringArray[size] = s;
        size += 1;
    }

    public String get() {
        rangeCheck(size-1);

        return stringArray[size-1];
    }

    public String get(int id) {
        rangeCheck(id);

        return stringArray[id];
    }

    public String remove() {

        rangeCheck(size-1);
        String oldValue = stringArray[size-1];
        stringArray[size-1] = null;
        size -= 1;

        return oldValue;
    }

    public String remove(int id) {
        rangeCheck(id);

        String oldValue = stringArray[id];

        int numMoved = size - id - 1;
        if (numMoved > 0)
            System.arraycopy(stringArray, id+1, stringArray, id,
                    numMoved);
        stringArray[size] = null;
        size -= 1;

        return oldValue;
    }

    public boolean delete() {

        for (int i = 0; i < size; i++)
            stringArray[i] = null;

        size = 0;

        return true;
    }

    /////////////////////////////////////////////
    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity - stringArray.length > 0)
            grow(minCapacity); //увеличим размерность
    }

    private void grow(int minCapacity) {

        int oldCapacity = stringArray.length;
        int newCapacity = oldCapacity + DEFAULT_LENGHT;
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;

        stringArray = Arrays.copyOf(stringArray, newCapacity);
    }

    private void rangeCheck(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString(){

        String result = "[";
        for (int i = 0; i < size; i++)
            result += stringArray[i] + ((i == size-1) ? "": ",");
        result += "]";

        return result;
    }
}

