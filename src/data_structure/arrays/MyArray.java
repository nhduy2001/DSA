package data_structure.arrays;

import java.util.Arrays;

public class MyArray {
    private Object[] data;
    private int length;
    private int capacity;

    public MyArray() {
        capacity = 1;
        length = 0;
        data = new Object[1];
    }

    Object get (int index) {
        return data[index];
    }

    void push (Object obj) {
        if (capacity == length) {
            data = Arrays.copyOf(data, capacity*2);
            capacity *= 2;
        }
        data[length] = obj;
        length++;
    }

    Object pop () {
        Object popped = data[length-1];
        data[length-1] = null;
        length--;
        return popped;
    }

    Object delete (int index) {
        Object object = data[index];
        shiftItem(index);
        return object;
    }

    void shiftItem (int index) {
        for (int i = index; i < length-1; i++) {
            data[i] = data[i+1];
        }
        data[length-1] = null;
        length--;
    }

    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.push("Duy");
        array.push("Nguyen");
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        array.pop();
        array.delete(0);
        System.out.println(array.get(0));
        System.out.println(array.get(1));

    }
}
